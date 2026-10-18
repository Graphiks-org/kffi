package org.graphiks.kffi.win32.testsupport

import org.graphiks.kffi.win32.managed.*
import java.lang.foreign.*
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.atomic.AtomicInteger

/** Independent, test-only TSF client. Uses actual Windows edit sessions and COM interfaces. */
public class Win32TextClient(private val services: Win32TextServices, store: Win32TextStore) : AutoCloseable {
    private val context = store.contextAddress.also(Win32TextComAbi::addRef)
    private val textStore = store.nativeAddress.also(Win32TextComAbi::addRef)
    private val sink = ClientEditSession(true) { 0 }
    private val clientId = Arena.ofConfined().use { arena ->
        val ids = Win32TextComAbi.query(services.managerAddress, "d60a7b49-1b9f-4be2-b702-47e9dc05dec3")
        try {
            val output = arena.allocate(4, 4)
            Win32TextComAbi.check(Win32TextComAbi.call(ids, 3, "pp",
                Win32TextComAbi.guid(arena, "7a2ff937-3ab0-4a1d-a2ed-fefc4ff687c9"), output))
            output.get(ValueLayout.JAVA_INT, 0)
        } finally { Win32TextComAbi.release(ids) }
    }
    private var composer = 0L
    private var composition = 0L
    private var closed = false

    public fun replaceSelection(text: String) {
        require(text.length <= 65_536)
        edit(7) { cookie -> selectedRange(cookie) { range, _, _ -> setText(range, cookie, text) }; 0 }
    }

    public fun startComposition(text: String) {
        require(text.length <= 65_536)
        check(composition == 0L)
        if (composer == 0L) composer = Win32TextComAbi.query(context, "d40c8aae-ac92-4fc7-9a11-0ee0e23aa39b")
        edit(7) { cookie ->
            selectedRange(cookie) { range, start, _ -> Arena.ofConfined().use { arena ->
                setText(range, cookie, text)
                val acp = Win32TextComAbi.query(range, Win32TextComAbi.RANGE_ACP)
                try { Win32TextComAbi.check(Win32TextComAbi.call(acp, 26, "ii", start, text.length)) }
                finally { Win32TextComAbi.release(acp) }
                val output = arena.allocate(ValueLayout.ADDRESS)
                Win32TextComAbi.check(Win32TextComAbi.call(composer, 3, "ippp", cookie,
                    MemorySegment.ofAddress(range), sink.address, output))
                composition = output.get(ValueLayout.ADDRESS, 0).address()
                check(composition != 0L)
                Win32TextComAbi.check(Win32TextComAbi.call(range, 15, "ii", cookie, 1))
                val selection = arena.allocate(16, 8)
                selection.set(ValueLayout.ADDRESS, 0, MemorySegment.ofAddress(range))
                selection.set(ValueLayout.JAVA_INT, 8, 2)
                Win32TextComAbi.check(Win32TextComAbi.call(context, 6, "iip", cookie, 1, selection))
            } }
            0
        }
    }

    public fun endComposition() {
        check(composition != 0L)
        edit(7) { cookie -> Win32TextComAbi.call(composition, 6, "i", cookie) }
        Win32TextComAbi.release(composition); composition = 0L
    }

    public fun caretRect(): Win32WindowRect {
        var result: Win32WindowRect? = null
        edit(3) { cookie ->
            selectedRange(cookie) { _, start, length -> Arena.ofConfined().use { arena ->
                val rect = arena.allocate(16, 4)
                val clipped = arena.allocate(4, 4)
                Win32TextComAbi.check(Win32TextComAbi.call(textStore, 26, "iiipp", 1, start + length,
                    start + length, rect, clipped))
                val x = rect.get(ValueLayout.JAVA_INT, 0); val y = rect.get(ValueLayout.JAVA_INT, 4)
                result = Win32WindowRect(x, y, rect.get(ValueLayout.JAVA_INT, 8) - x, rect.get(ValueLayout.JAVA_INT, 12) - y)
            } }
            0
        }
        return checkNotNull(result)
    }

    private fun selectedRange(cookie: Int, block: (Long, Int, Int) -> Unit) = Arena.ofConfined().use { arena ->
        val selection = arena.allocate(16, 8); val fetched = arena.allocate(4, 4)
        Win32TextComAbi.check(Win32TextComAbi.call(context, 5, "iiipp", cookie, -1, 1, selection, fetched))
        check(fetched.get(ValueLayout.JAVA_INT, 0) == 1)
        val range = selection.get(ValueLayout.ADDRESS, 0).address()
        try {
            val acp = Win32TextComAbi.query(range, Win32TextComAbi.RANGE_ACP)
            try {
                val start = arena.allocate(4, 4); val length = arena.allocate(4, 4)
                Win32TextComAbi.check(Win32TextComAbi.call(acp, 25, "pp", start, length))
                block(range, start.get(ValueLayout.JAVA_INT, 0), length.get(ValueLayout.JAVA_INT, 0))
            } finally { Win32TextComAbi.release(acp) }
        } finally { Win32TextComAbi.release(range) }
    }

    private fun setText(range: Long, cookie: Int, text: String) = Arena.ofConfined().use { arena ->
        val buffer = arena.allocate(maxOf(2L, text.length * 2L), 2)
        text.forEachIndexed { index, char -> buffer.set(ValueLayout.JAVA_CHAR, index * 2L, char) }
        Win32TextComAbi.check(Win32TextComAbi.call(range, 4, "iipi", cookie, 0, buffer, text.length))
    }
    private fun edit(flags: Int, block: (Int) -> Int) {
        services.checkThread(); check(!closed)
        ClientEditSession(false, block).use { callback -> Arena.ofConfined().use { arena ->
            val result = arena.allocate(4, 4)
            Win32TextComAbi.check(Win32TextComAbi.call(context, 3, "ipip", clientId, callback.address, flags, result))
            callback.failure?.let { throw it }
            Win32TextComAbi.check(result.get(ValueLayout.JAVA_INT, 0))
        } }
    }

    override fun close() {
        services.checkThread()
        if (closed) return
        try { if (composition != 0L) runCatching { endComposition() } }
        finally {
            closed = true
            Win32TextComAbi.release(composition); composition = 0
            Win32TextComAbi.release(composer); composer = 0
            Win32TextComAbi.release(context)
            Win32TextComAbi.release(textStore)
            sink.close()
        }
    }
}

/** Caller-owned ABI fixture; Windows keeps only temporary references during the synchronous edit. */
private class ClientEditSession(private val compositionSink: Boolean, private val block: (Int) -> Int) : AutoCloseable {
    private val arena = Arena.ofConfined()
    private val refs = AtomicInteger(1)
    var failure: Throwable? = null
    val address: MemorySegment = arena.allocate(ValueLayout.ADDRESS)
    init {
        val table = arena.allocate(32, 8)
        val signatures = listOf("query" to arrayOf(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            "addRef" to arrayOf(ValueLayout.ADDRESS), "release" to arrayOf(ValueLayout.ADDRESS),
            if (compositionSink) "terminated" to arrayOf(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
            else "edit" to arrayOf(ValueLayout.ADDRESS, ValueLayout.JAVA_INT))
        signatures.forEachIndexed { slot, (method, parameters) ->
            val descriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT, *parameters)
            val target = MethodHandles.lookup().findVirtual(ClientEditSession::class.java, method,
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
        catch (cause: Throwable) { failure = cause; 0x80004005.toInt() }
    fun terminated(self: MemorySegment, cookie: Int, composition: MemorySegment): Int = 0
    override fun close() { check(refs.get() == 1) { "native edit client reference count=${refs.get()}" }; arena.close() }
}
