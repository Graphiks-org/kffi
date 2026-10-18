package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.graphiks.kffi.win32.generated.CoTaskMemFree
import org.graphiks.kffi.win32.generated.CoInitializeEx
import org.graphiks.kffi.win32.generated.CoUninitialize
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicInteger
import org.graphiks.kffi.win32.testsupport.Win32TextClient
import kotlin.test.*

class Win32TextServicesIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun closedOwnerDoesNotKeepTheReleasedAcceptedDocument() {
        window().use { window -> Win32TextServices.open().use { services ->
            var retained = 0L
            val budget = Win32PayloadBudget { bytes ->
                retained += bytes
                AutoCloseable { retained -= bytes }
            }
            val store = services.createStore(window.hwnd, Win32TextSnapshot("initial", Win32TextRange(0, 0), 10),
                configuration(), Win32TextLimits(1024, 16, 64, budget), { true }, { throw it })
            store.apply(Win32TextSnapshot("accepted", Win32TextRange(8, 8), 11))
            store.close()
            assertTrue(store.nativeClosed)
            assertEquals(0L, retained)
            // Closed owners can remain reachable through COM clients. Returning the reservation
            // is only valid once their owned document reference is empty too.
            val snapshot = Win32TextStore::class.java.getDeclaredField("accepted").let {
                it.isAccessible = true
                it.get(store) as Win32TextSnapshot
            }
            assertEquals("", snapshot.text)
        } }
    }

    @Test fun clientCaretCoordinatesRoundTripWithoutNarrowingToMessageWords() {
        window().use { window ->
            val expected = Win32Point(1_000_000, -1_000_000)
            val client = Win32Pointer.screenToClient(window.hwnd, expected.x, expected.y)
            assertEquals(expected, Win32Pointer.clientToScreen(window.hwnd, client.x, client.y))
        }
    }

    @Test fun independentClientUsesRealEditSessionsCompositionAndCaret() {
        window().use { window -> Win32TextServices.open().use { services ->
            val changes = mutableListOf<Win32TextChange>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), limits(), { changes += it; true }, { throw it }).use { store ->
                store.activate()
                Win32TextClient(services, store).use { client ->
                    client.startComposition("😀")
                    assertEquals(Win32TextChange.Composition(Win32TextRange(1, 1), "😀", Win32TextRange(2, 2), 10), changes.single())
                    store.apply(Win32TextSnapshot("a😀b", Win32TextRange(3, 3), 11))
                    store.updateCursor(Win32WindowRect(100, 200, 2, 20), 11)
                    assertEquals(Win32WindowRect(100, 200, 2, 20), client.caretRect())
                    client.endComposition()
                    assertEquals(Win32TextChange.Composition(null, "", null, 11), changes.last())
                }
            }
        } }
    }

    @Test fun nativeCharactersWaitForWritebackAndDoNotDoubleCommit() {
        window().use { window -> Win32TextServices.open().use { services ->
            val changes = mutableListOf<Win32TextChange>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), limits(), { changes += it; true }, { throw it }).use { store ->
                store.activate(); store.setFocused(true)
                assertEquals(1L, store.handleCharacter(0x109, 0xffff, 0))
                assertEquals(0L, store.handleCharacter(0x102, 0xd83d, 1))
                assertTrue(changes.isEmpty())
                assertEquals(0L, store.handleCharacter(0x102, 0xde00, 1))
                assertEquals(Win32TextChange.Replace(Win32TextRange(1, 1), "😀", 10), changes.single())
                assertEquals(0L, store.handleCharacter(0x286, 'x'.code.toLong(), 1))
                assertEquals(0L, store.handleCharacter(0x102, 'x'.code.toLong(), 1))
                assertEquals(1, changes.size)
                store.apply(Win32TextSnapshot("a😀b", Win32TextRange(3, 3), 11))
                assertEquals(2, changes.size)
                assertEquals(Win32TextChange.Replace(Win32TextRange(3, 3), "x", 11), changes.last())
            }
        } }
    }

    @Test fun pendingCharactersRespectTheBoundAndReleaseAllPayload() {
        window().use { window -> Win32TextServices.open().use { services ->
            var retained = 0L
            val budget = Win32PayloadBudget { bytes ->
                retained += bytes
                var closed = false
                AutoCloseable { check(!closed); closed = true; retained -= bytes }
            }
            val changes = mutableListOf<Win32TextChange>()
            val failures = mutableListOf<Throwable>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), Win32TextLimits(1024, 2, 64, budget), { changes += it; true }, { failures += it }).use { store ->
                store.activate(); store.setFocused(true)
                for (letter in "xyzw") store.handleCharacter(0x102, letter.code.toLong(), 1)
                assertEquals(1, changes.size)
                assertEquals(Win32TextDocument.OUT_OF_MEMORY, assertIs<Win32TextException>(failures.single()).hresult)
                assertTrue(store.nativeClosed)
                assertEquals(0L, retained)
            }
        } }
    }

    @Test fun malformedUtf16IsRejectedWithoutInventedText() {
        window().use { window -> Win32TextServices.open().use { services ->
            val changes = mutableListOf<Win32TextChange>()
            val failures = mutableListOf<Throwable>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), limits(), { changes += it; true }, { failures += it }).use { store ->
                store.activate(); store.setFocused(true)
                store.handleCharacter(0x102, 0xd83d, 1)
                store.handleCharacter(0x102, '!'.code.toLong(), 1)
                assertTrue(changes.isEmpty())
                assertEquals(Win32TextDocument.INVALID_ARGUMENT, assertIs<Win32TextException>(failures.single()).hresult)
                assertTrue(store.nativeClosed)
            }
        } }
    }

    @Test fun focusLossDiscardsAnIncompleteCharacterInsteadOfJoiningTwoFocusEpochs() {
        window().use { window -> Win32TextServices.open().use { services ->
            val changes = mutableListOf<Win32TextChange>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), limits(), { changes += it; true }, {}).use { store ->
                store.activate(); store.setFocused(true)
                store.handleCharacter(0x102, 0xd83d, 1)
                store.setFocused(false)
                store.setFocused(true)
                store.handleCharacter(0x102, 0xde00, 1)
                assertTrue(changes.isEmpty())
                assertTrue(store.nativeClosed)
            }
        } }
    }

    @Test fun changesBeforeActivationKeepTheirPayloadReservationUntilDelivery() {
        window().use { window -> Win32TextServices.open().use { services ->
            var retained = 0L
            val budget = Win32PayloadBudget { bytes ->
                if (bytes > 14 - retained) null else {
                    retained += bytes
                    var closed = false
                    AutoCloseable { check(!closed); closed = true; retained -= bytes }
                }
            }
            val changes = mutableListOf<Win32TextChange>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(0, 1), 0), configuration(),
                Win32TextLimits(1024, 16, 64, budget), { changes += it; true }, { throw it }).use { store ->
                replaceSelectionWithX(services, store)
                assertTrue(changes.isEmpty())
                val denied = budget.retain(4)
                denied?.close()
                assertNull(denied)
                store.activate()
                assertEquals(Win32TextChange.Replace(Win32TextRange(0, 1), "x", 0), changes.single())
                assertNotNull(budget.retain(4)).close()
            }
            assertEquals(0L, retained)
        } }
    }

    @Test fun activationFailureClosesTheUndeliveredOwner() {
        window().use { window -> Win32TextServices.open().use { services ->
            val failures = mutableListOf<Throwable>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(0, 1), 0), configuration(),
                limits(), { error("receiver rejected") }, { failures += it }).use { store ->
                replaceSelectionWithX(services, store)
                assertFailsWith<IllegalStateException> { store.activate() }
                assertTrue(store.nativeClosed)
                assertEquals(1, failures.size)
            }
        } }
    }

    @Test fun incompatibleApartmentLeavesTheBasicWindowUsable() {
        window().use { window ->
            assertEquals(0, CoInitializeEx(MemorySegment.NULL, 0))
            try {
                assertEquals(0x80010106.toInt(), assertFailsWith<Win32TextException> { Win32TextServices.open() }.hresult)
                assertTrue(Win32WindowProperties.read(window.hwnd).clientWidth > 0)
            } finally { CoUninitialize() }
        }
    }

    @Test fun nativeInputScopesCarryTheExactPurposeAndCallerOwnedMemory() {
        window().use { window -> Win32TextServices.open().use { services ->
            val expected = listOf(0, 7, 5, 1, 32, 28, 29, 31)
            Win32TextPurpose.entries.forEachIndexed { index, purpose ->
                services.createStore(window.hwnd, Win32TextSnapshot("", Win32TextRange(0, 0), 0),
                    configuration().copy(purpose = purpose), limits(), { true }, { throw it }).use { store ->
                    val scope = Win32TextComAbi.query(store.nativeAddress, Win32TextComAbi.INPUT_SCOPE)
                    try { Arena.ofConfined().use { arena ->
                        val output = arena.allocate(ValueLayout.ADDRESS)
                        val count = arena.allocate(4, 4)
                        assertEquals(0, Win32TextComAbi.call(scope, 3, "pp", output, count))
                        val values = output.get(ValueLayout.ADDRESS, 0)
                        try {
                            assertEquals(1, count.get(ValueLayout.JAVA_INT, 0))
                            assertEquals(expected[index], values.reinterpret(4).get(ValueLayout.JAVA_INT, 0))
                        } finally { CoTaskMemFree(values) }
                    } } finally { Win32TextComAbi.release(scope) }
                }
            }
        } }
    }

    @Test fun realTsfCompositionRebasesAndEndsWithoutASecondCommit() = persistentComposition(false)
    @Test fun ownerTerminationPublishesTheNativeCompositionEnd() = persistentComposition(true)

    private fun persistentComposition(terminateFromOwner: Boolean) {
        window().use { window -> Win32TextServices.open().use { services ->
            val changes = mutableListOf<Win32TextChange>()
            services.createStore(window.hwnd, Win32TextSnapshot("ab", Win32TextRange(1, 1), 10),
                configuration(), limits(), { changes += it; true }, { throw it }).use { store ->
                store.activate()
                val fixtureClient = fixtureClientId(services)
                val composer = Win32TextComAbi.query(store.contextAddress, "d40c8aae-ac92-4fc7-9a11-0ee0e23aa39b")
                val compositionSink = NativeEditSession(true) { 0 }
                var composition = 0L
                try {
                    editSync(services, store, fixtureClient) { cookie -> Arena.ofConfined().use { arena ->
                        Win32ComResources().use { references ->
                            val selection = arena.allocate(16, 8)
                            val fetched = arena.allocate(4, 4)
                            Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 5, "iiipp", cookie, -1, 1, selection, fetched))
                            assertEquals(1, fetched.get(ValueLayout.JAVA_INT, 0))
                            val range = references.own(selection.get(ValueLayout.ADDRESS, 0).address(), Win32TextComAbi::release)
                            val acp = references.own(Win32TextComAbi.query(range, Win32TextComAbi.RANGE_ACP), Win32TextComAbi::release)
                            val start = arena.allocate(4, 4)
                            val length = arena.allocate(4, 4)
                            Win32TextComAbi.check(Win32TextComAbi.call(acp, 25, "pp", start, length))
                            assertEquals(1, start.get(ValueLayout.JAVA_INT, 0))
                            assertEquals(0, length.get(ValueLayout.JAVA_INT, 0))
                            val output = arena.allocate(ValueLayout.ADDRESS)
                            val text = arena.allocate(4, 2)
                            text.set(ValueLayout.JAVA_CHAR, 0, '\uD83D'); text.set(ValueLayout.JAVA_CHAR, 2, '\uDE00')
                            Win32TextComAbi.check(Win32TextComAbi.call(range, 4, "iipi", cookie, 0, text, 2))
                            Win32TextComAbi.check(Win32TextComAbi.call(acp, 26, "ii", 1, 2))
                            Win32TextComAbi.check(Win32TextComAbi.call(composer, 3, "ippp", cookie, MemorySegment.ofAddress(range), compositionSink.address, output))
                            composition = output.get(ValueLayout.ADDRESS, 0).address()
                            assertTrue(composition != 0L)
                            Win32TextComAbi.check(Win32TextComAbi.call(range, 15, "ii", cookie, 1))
                            selection.set(ValueLayout.JAVA_INT, 8, 2)
                            Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 6, "iip", cookie, 1, selection))
                        }
                    }; 0 }
                    assertEquals(Win32TextChange.Composition(Win32TextRange(1, 1), "😀", Win32TextRange(2, 2), 10), changes.single())
                    store.apply(Win32TextSnapshot("a😀b", Win32TextRange(3, 3), 11))
                    if (terminateFromOwner) {
                        val ownerServices = Win32TextComAbi.query(store.contextAddress, "86462810-593b-4916-9764-19c08e9ce110")
                        val view = Win32TextComAbi.query(composition, "d7540241-f9a1-4364-befc-dbcd2c4395b7")
                        try { Win32TextComAbi.check(Win32TextComAbi.call(ownerServices, 7, "p", MemorySegment.ofAddress(view))) }
                        finally { Win32TextComAbi.release(view); Win32TextComAbi.release(ownerServices) }
                    } else editSync(services, store, fixtureClient) { cookie -> Win32TextComAbi.call(composition, 6, "i", cookie) }
                    assertEquals(2, changes.size)
                    assertEquals(Win32TextChange.Composition(null, "", null, 11), changes.last())
                } finally { Win32TextComAbi.release(composition); Win32TextComAbi.release(composer); compositionSink.close() }
            }
        } }
    }

    @Test fun nativeContextQueriesTheRealTextStoreAndReleasesIt() {
        window().use { window ->
            Win32TextServices.open().use { services ->
                store(services, window.hwnd).use { store ->
                    store.activate()
                    Arena.ofConfined().use { arena ->
                        val status = arena.allocate(8, 4)
                        assertEquals(0, Win32TextComAbi.call(store.contextAddress, 11, "p", status))
                        assertEquals(0x88, status.get(ValueLayout.JAVA_INT, 4) and 0x88)
                        val identity = Win32TextComAbi.query(store.nativeAddress, Win32TextComAbi.UNKNOWN)
                        assertEquals(store.nativeAddress, identity)
                        Win32TextComAbi.release(identity)
                        val hwnd = arena.allocate(ValueLayout.ADDRESS)
                        assertEquals(0, Win32TextComAbi.call(store.nativeAddress, 28, "ip", 1, hwnd))
                        assertEquals(window.hwnd, hwnd.get(ValueLayout.ADDRESS, 0).address())
                    }
                }
            }
        }
    }

    @Test fun nativeLockUpgradeAndSurroundingTextUseTheSdkAbi() {
        window().use { window ->
            Win32TextServices.open().use { services ->
                store(services, window.hwnd).use { store ->
                    store.activate()
                    val trace = mutableListOf<String>()
                    NativeEditSession { trace += "write"; 0 }.use { write ->
                        NativeEditSession { cookie ->
                            trace += "read"
                            Arena.ofConfined().use { arena ->
                                val rangeOut = arena.allocate(ValueLayout.ADDRESS)
                                Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 7, "ip", cookie, rangeOut))
                                val range = rangeOut.get(ValueLayout.ADDRESS, 0).address()
                                try {
                                    val shifted = arena.allocate(4, 4)
                                    Win32TextComAbi.check(Win32TextComAbi.call(range, 9, "iipp", cookie, 4, shifted, MemorySegment.NULL))
                                    assertEquals(4, shifted.get(ValueLayout.JAVA_INT, 0))
                                    val text = arena.allocate(16, 2)
                                    val count = arena.allocate(4, 4)
                                    Win32TextComAbi.check(Win32TextComAbi.call(range, 3, "iipip", cookie, 0, text, 8, count))
                                    assertEquals(4, count.get(ValueLayout.JAVA_INT, 0))
                                    assertEquals("a😀b", CharArray(4) { text.get(ValueLayout.JAVA_CHAR, it * 2L) }.concatToString())
                                } finally { Win32TextComAbi.release(range) }
                                val session = arena.allocate(4, 4)
                                assertEquals(0, Win32TextComAbi.call(store.contextAddress, 3, "ipip", services.clientId,
                                    write.address, 14, session))
                                assertEquals(0x40300, session.get(ValueLayout.JAVA_INT, 0))
                            }
                            trace += "read-return"
                            0
                        }.use { read ->
                            Arena.ofConfined().use { arena ->
                                val session = arena.allocate(4, 4)
                                assertEquals(0, Win32TextComAbi.call(store.contextAddress, 3, "ipip", services.clientId,
                                    read.address, 3, session))
                                Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
                                    val deadline = System.nanoTime() + 5_000_000_000L
                                    while (trace.size < 3 && System.nanoTime() < deadline) pump.pollOne(1)
                                }
                                read.failure?.let { throw it }
                                write.failure?.let { throw it }
                                assertEquals(0, session.get(ValueLayout.JAVA_INT, 0))
                                assertEquals(listOf("read", "read-return", "write"), trace)
                            }
                        }
                    }
                }
            }
        }
    }

    @Test fun workerCloseRevokesBeforeUiRelease() {
        window().use { window ->
            Win32ControlWindow.open { _, _, _, _ -> 0 }.use { pump ->
                Win32TextServices.open().use { services ->
                    val store = store(services, window.hwnd)
                    store.activate()
                    val worker = Thread { store.close() }
                    worker.start(); worker.join(5_000)
                    assertFalse(worker.isAlive)
                    assertNull(store.handleCharacter(0x102, 'x'.code.toLong(), 1))
                    val deadline = System.nanoTime() + 5_000_000_000L
                    while (!store.nativeClosed && System.nanoTime() < deadline) pump.pollOne(1)
                    assertTrue(store.nativeClosed)
                    store.close()
                }
            }
        }
    }

    @Test fun cursorLayoutRefusesUnknownTextGeometry() {
        window().use { window ->
            Win32TextServices.open().use { services ->
                store(services, window.hwnd).use { store ->
                    store.activate()
                    store.updateCursor(Win32WindowRect(-20, 50, 2, 18), 0)
                    NativeEditSession {
                        Arena.ofConfined().use { arena ->
                            val rect = arena.allocate(16, 4)
                            val clipped = arena.allocate(4, 4)
                            assertEquals(0, Win32TextComAbi.call(store.nativeAddress, 26, "iiipp", 1, 0, 0, rect, clipped))
                            assertEquals(listOf(-20, 50, -18, 68), (0..3).map { rect.get(ValueLayout.JAVA_INT, it * 4L) })
                            assertEquals(0x80040206.toInt(), Win32TextComAbi.call(store.nativeAddress, 26, "iiipp", 1, 0, 1, rect, clipped))
                        }
                        0
                    }.use { edit ->
                        Arena.ofConfined().use { arena ->
                            val session = arena.allocate(4, 4)
                            Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 3, "ipip", services.clientId, edit.address, 3, session))
                            edit.failure?.let { throw it }
                            assertEquals(0, session.get(ValueLayout.JAVA_INT, 0))
                        }
                    }
                }
            }
        }
    }

    private fun configuration() = Win32TextConfiguration(Win32TextPurpose.Text, Win32TextAction.Default,
        Win32TextCapitalization.None, true, true)
    private fun limits() = Win32TextLimits(1024, 16, 64, Win32PayloadBudget { AutoCloseable {} })
    private fun store(services: Win32TextServices, hwnd: Long): Win32TextStore = services.createStore(hwnd,
        Win32TextSnapshot("a😀b", Win32TextRange(0, 0), 0), configuration(), limits(), { true }, { throw it })

    private fun window() = Win32ManagedWindow.open("Native text services") { h, m, w, l ->
        DefWindowProcW(MemorySegment.ofAddress(h), m, w, l)
    }

    private fun fixtureClientId(services: Win32TextServices): Int = Arena.ofConfined().use { arena ->
        val clientIds = Win32TextComAbi.query(services.managerAddress, "d60a7b49-1b9f-4be2-b702-47e9dc05dec3")
        try {
            val output = arena.allocate(4, 4)
            Win32TextComAbi.check(Win32TextComAbi.call(clientIds, 3, "pp",
                Win32TextComAbi.guid(arena, "7a2ff937-3ab0-4a1d-a2ed-fefc4ff687c9"), output))
            output.get(ValueLayout.JAVA_INT, 0)
        } finally { Win32TextComAbi.release(clientIds) }
    }

    private fun replaceSelectionWithX(services: Win32TextServices, store: Win32TextStore) {
        editSync(services, store) { cookie -> Arena.ofConfined().use { arena ->
            val selection = arena.allocate(16, 8)
            val fetched = arena.allocate(4, 4)
            Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 5, "iiipp", cookie, -1, 1, selection, fetched))
            val range = selection.get(ValueLayout.ADDRESS, 0).address()
            try {
                val text = arena.allocate(2, 2).also { it.set(ValueLayout.JAVA_CHAR, 0, 'x') }
                Win32TextComAbi.call(range, 4, "iipi", cookie, 0, text, 1)
            } finally { Win32TextComAbi.release(range) }
        } }
    }

    private fun editSync(services: Win32TextServices, store: Win32TextStore, clientId: Int = services.clientId, block: (Int) -> Int) {
        NativeEditSession(block = block).use { edit -> Arena.ofConfined().use { arena ->
            val result = arena.allocate(4, 4)
            Win32TextComAbi.check(Win32TextComAbi.call(store.contextAddress, 3, "ipip", clientId, edit.address, 7, result))
            edit.failure?.let { throw it }
            assertEquals(0, result.get(ValueLayout.JAVA_INT, 0))
        } }
    }

    /** A real caller-owned ITfEditSession fixture. TSF invokes it and owns its temporary refs. */
    private class NativeEditSession(private val compositionSink: Boolean = false, private val block: (Int) -> Int) : AutoCloseable {
        private val arena = Arena.ofConfined()
        private val refs = AtomicInteger(1)
        var failure: Throwable? = null
        val address: MemorySegment = arena.allocate(ValueLayout.ADDRESS)
        init {
            val table = arena.allocate(32, 8)
            val lookup = MethodHandles.lookup()
            val signatures = listOf("query" to arrayOf(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                "addRef" to arrayOf(ValueLayout.ADDRESS), "release" to arrayOf(ValueLayout.ADDRESS),
                if (compositionSink) "terminated" to arrayOf(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
                else "edit" to arrayOf(ValueLayout.ADDRESS, ValueLayout.JAVA_INT))
            signatures.forEachIndexed { slot, (method, parameters) ->
                val descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, *parameters)
                val target = lookup.findVirtual(NativeEditSession::class.java, method,
                    MethodType.methodType(Int::class.javaPrimitiveType, parameters.map { it.carrier() })).bindTo(this)
                table.set(ValueLayout.ADDRESS, slot * 8L, Linker.nativeLinker().upcallStub(target, descriptor, arena))
            }
            address.set(ValueLayout.ADDRESS, 0, table)
        }
        fun query(self: MemorySegment, iid: MemorySegment, output: MemorySegment): Int {
            Win32TextComAbi.writePointer(output, 0)
            if (!Win32TextComAbi.matches(iid, Win32TextComAbi.UNKNOWN) &&
                !Win32TextComAbi.matches(iid, if (compositionSink) "a781718c-579a-4b15-a280-32b8577acc5e"
                    else "aa80e803-2021-11d2-93e0-0060b067b86e")) return 0x80004002.toInt()
            refs.incrementAndGet(); Win32TextComAbi.writePointer(output, address.address()); return 0
        }
        fun addRef(self: MemorySegment): Int = refs.incrementAndGet()
        fun release(self: MemorySegment): Int = refs.decrementAndGet()
        fun edit(self: MemorySegment, cookie: Int): Int = try { block(cookie) }
            catch (caught: Throwable) { failure = caught; 0x80004005.toInt() }
        fun terminated(self: MemorySegment, cookie: Int, composition: MemorySegment): Int = 0
        override fun close() { assertEquals(1, refs.get()); arena.close() }
    }
}
