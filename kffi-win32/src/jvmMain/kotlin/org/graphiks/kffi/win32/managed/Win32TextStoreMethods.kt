package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.lang.foreign.Arena
import org.graphiks.kffi.win32.generated.ClientToScreen
import org.graphiks.kffi.win32.generated.GetClientRect
import org.graphiks.kffi.win32.generated.CoTaskMemAlloc

internal class Win32TextStoreMethods(private val owner: Win32TextComObject) {
    private val document get() = owner.document
    private val limits get() = owner.limits

    fun dispatch(slot: Int, args: Array<Any>): Int = when (slot) {
        3 -> advise(args)
        4 -> unadvise(args)
        5 -> requestLock(args)
        6 -> {
            Win32TextComAbi.requirePointer(args.pointer(0))
            val status = args.pointer(0).reinterpret(8)
            status.set(ValueLayout.JAVA_INT, 0, 0)
            status.set(ValueLayout.JAVA_INT, 4, 8 or (if (owner.configuration.multiline) 0x80 else 0) or
                (if (owner.configuration.autocorrect) 0x10 else 0))
            0
        }
        7 -> {
            val snapshot = document.read()
            checkRange(args.int(0), args.int(1), snapshot.text.length)
            checkCount(args.int(2), limits.maxCodeUnits)
            if (snapshot.text.length.toLong() - (args.int(1) - args.int(0)) + args.int(2) > limits.maxCodeUnits)
                throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
            Win32TextComAbi.requirePointer(args.pointer(3)); Win32TextComAbi.requirePointer(args.pointer(4))
            Win32TextComAbi.writeInt(args.pointer(3), args.int(0)); Win32TextComAbi.writeInt(args.pointer(4), args.int(1)); 0
        }
        8 -> getSelection(args)
        9 -> setSelection(args)
        10 -> getText(args)
        11 -> setText(args)
        12, 13, 15, 17 -> 0x80004001.toInt() // No rich/embedded document representation.
        14 -> { Win32TextComAbi.requirePointer(args.pointer(2)); 0 } // Not insertable.
        16 -> insertAtSelection(args)
        18, 19, 20 -> requestAttributes(slot, args)
        21 -> {
            document.read().also { checkRange(args.int(0), args.int(1), it.text.length) }
            checkCount(args.int(2), limits.maxCollectionElements)
            if (args.int(2) > 0) Win32TextComAbi.requirePointer(args.pointer(3))
            listOf(5, 6, 7).forEach { Win32TextComAbi.requirePointer(args.pointer(it)) }
            Win32TextComAbi.writeInt(args.pointer(5), args.int(1)); 0
        }
        22 -> retrieveAttributes(args)
        23 -> { val snapshot = document.read(); Win32TextComAbi.requirePointer(args.pointer(0)); Win32TextComAbi.writeInt(args.pointer(0), snapshot.text.length); 0 }
        24 -> { Win32TextComAbi.requirePointer(args.pointer(0)); Win32TextComAbi.writeInt(args.pointer(0), 1); 0 }
        25 -> { document.read(); 0x80040206.toInt() }
        26 -> textExtent(args)
        27 -> screenExtent(args)
        28 -> {
            if (args.int(0) != 1) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
            Win32TextComAbi.requirePointer(args.pointer(1)); Win32TextComAbi.writePointer(args.pointer(1), owner.hwnd); 0
        }
        else -> 0x80004001.toInt()
    }

    private fun advise(args: Array<Any>): Int {
        if (!Win32TextComAbi.matches(args.pointer(0), Win32TextComAbi.TEXT_SINK)) return Win32TextDocument.INVALID_ARGUMENT
        val candidate = Win32TextComAbi.query(args.pointer(1).address(), Win32TextComAbi.TEXT_SINK)
        var transferred = false
        try {
            if (owner.sink != 0L) {
                Win32ComResources().use { refs ->
                    val oldIdentity = refs.own(Win32TextComAbi.query(owner.sink, Win32TextComAbi.UNKNOWN), Win32TextComAbi::release)
                    val newIdentity = refs.own(Win32TextComAbi.query(candidate, Win32TextComAbi.UNKNOWN), Win32TextComAbi::release)
                    if (oldIdentity != newIdentity) return 0x80040201.toInt()
                }
            }
            val old = owner.sink
            owner.sink = candidate
            owner.sinkMask = args.int(2)
            owner.sinkEpoch++
            transferred = true
            Win32TextComAbi.release(old)
        } finally { if (!transferred) Win32TextComAbi.release(candidate) }
        return 0
    }

    private fun unadvise(args: Array<Any>): Int {
        if (owner.sink == 0L) return 0x80040200.toInt()
        val oldIdentity = Win32TextComAbi.query(owner.sink, Win32TextComAbi.UNKNOWN)
        val candidate = Win32TextComAbi.query(args.pointer(0).address(), Win32TextComAbi.UNKNOWN)
        try { if (oldIdentity != candidate) return 0x80040200.toInt() }
        finally { Win32TextComAbi.release(candidate); Win32TextComAbi.release(oldIdentity) }
        val old = owner.sink
        owner.sink = 0
        owner.sinkMask = 0
        owner.sinkEpoch++
        Win32TextComAbi.release(old)
        return 0
    }

    private fun requestLock(args: Array<Any>): Int {
        Win32TextComAbi.requirePointer(args.pointer(1))
        if (owner.sink == 0L) return 0x8000ffff.toInt()
        val sinkEpoch = owner.sinkEpoch
        val result = document.requestLock(args.int(0)) { access ->
            if (owner.sinkEpoch != sinkEpoch || owner.sink == 0L) 0x80010108.toInt()
            else Win32TextComAbi.call(owner.sink, 8, "i", access)
        }
        Win32TextComAbi.writeInt(args.pointer(1), result.sessionResult)
        return result.result
    }

    private fun getSelection(args: Array<Any>): Int {
        val selection = document.read().selection
        if (args.int(0) !in listOf(0, -1)) return 0x80040205.toInt()
        checkCount(args.int(1), limits.maxCollectionElements)
        Win32TextComAbi.requirePointer(args.pointer(3))
        if (args.int(1) == 0) return 0
        Win32TextComAbi.requirePointer(args.pointer(2))
        val target = args.pointer(2).reinterpret(16)
        target.set(ValueLayout.JAVA_INT, 0, selection.start)
        target.set(ValueLayout.JAVA_INT, 4, selection.endExclusive)
        target.set(ValueLayout.JAVA_INT, 8, 2) // TS_AE_END
        target.set(ValueLayout.JAVA_INT, 12, 0)
        Win32TextComAbi.writeInt(args.pointer(3), 1)
        return 0
    }

    private fun setSelection(args: Array<Any>): Int {
        if (args.int(0) != 1) return Win32TextDocument.INVALID_ARGUMENT
        Win32TextComAbi.requirePointer(args.pointer(1))
        val source = args.pointer(1).reinterpret(16)
        document.setSelection(source.get(ValueLayout.JAVA_INT, 0), source.get(ValueLayout.JAVA_INT, 4))
        return 0
    }

    private fun insertAtSelection(args: Array<Any>): Int {
        val selection = document.read().selection
        val count = args.int(2)
        checkCount(count, limits.maxCodeUnits)
        if (args.int(0) and 3.inv() != 0) return Win32TextDocument.INVALID_ARGUMENT
        if (args.int(0) and 2 != 0) {
            Win32TextComAbi.requirePointer(args.pointer(3)); Win32TextComAbi.requirePointer(args.pointer(4))
            Win32TextComAbi.writeInt(args.pointer(3), selection.start)
            Win32TextComAbi.writeInt(args.pointer(4), selection.endExclusive)
            return 0
        }
        val result = setText(arrayOf(0, selection.start, selection.endExclusive, args.pointer(1), count, args.pointer(5)))
        Win32TextComAbi.writeInt(args.pointer(3), selection.start)
        Win32TextComAbi.writeInt(args.pointer(4), selection.start + count)
        return result
    }

    private fun getText(args: Array<Any>): Int {
        val snapshot = document.read()
        val start = args.int(0)
        val end = if (args.int(1) == -1) snapshot.text.length else args.int(1)
        checkRange(start, end, snapshot.text.length)
        val plainCapacity = args.int(3)
        val runCapacity = args.int(6)
        checkCount(plainCapacity, limits.maxCodeUnits)
        checkCount(runCapacity, limits.maxCollectionElements)
        listOf(4, 7, 8).forEach { Win32TextComAbi.requirePointer(args.pointer(it)) }
        if (plainCapacity > 0) Win32TextComAbi.requirePointer(args.pointer(2))
        if (runCapacity > 0) Win32TextComAbi.requirePointer(args.pointer(5))
        val count = if (plainCapacity == 0 && runCapacity > 0) end - start else minOf(plainCapacity, end - start)
        if (plainCapacity > 0) {
            val buffer = args.pointer(2).reinterpret(plainCapacity.toLong() * 2)
            repeat(count) { buffer.set(ValueLayout.JAVA_CHAR, it * 2L, snapshot.text[start + it]) }
            Win32TextComAbi.writeInt(args.pointer(4), count)
        }
        if (runCapacity > 0 && count > 0) {
            val run = args.pointer(5).reinterpret(8)
            run.set(ValueLayout.JAVA_INT, 0, count)
            run.set(ValueLayout.JAVA_INT, 4, 0) // TS_RT_PLAIN
            Win32TextComAbi.writeInt(args.pointer(7), 1)
        }
        Win32TextComAbi.writeInt(args.pointer(8), start + count)
        return 0
    }

    private fun setText(args: Array<Any>): Int {
        val snapshot = document.read()
        val start = args.int(1)
        val end = args.int(2)
        checkRange(start, end, snapshot.text.length)
        val count = args.int(4)
        checkCount(count, limits.maxCodeUnits)
        Win32TextComAbi.requirePointer(args.pointer(5))
        if (count > 0) Win32TextComAbi.requirePointer(args.pointer(3))
        if (snapshot.text.length.toLong() - (end - start) + count > limits.maxCodeUnits) throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
        val lease = limits.payloadBudget.retain(count.toLong() * 2) ?: throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
        lease.use {
            val source = if (count == 0) MemorySegment.NULL else args.pointer(3).reinterpret(count.toLong() * 2)
            val text = CharArray(count) { source.get(ValueLayout.JAVA_CHAR, it * 2L) }.concatToString()
            document.setText(start, end, text)
        }
        val change = args.pointer(5).reinterpret(12)
        change.set(ValueLayout.JAVA_INT, 0, start)
        change.set(ValueLayout.JAVA_INT, 4, end)
        change.set(ValueLayout.JAVA_INT, 8, start + count)
        return 0
    }

    private fun textExtent(args: Array<Any>): Int {
        val snapshot = document.read()
        if (args.int(0) != 1) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
        checkRange(args.int(1), args.int(2), snapshot.text.length)
        val cursor = owner.cursor
        if (cursor == null || cursor.first != snapshot.epoch || args.int(1) != args.int(2) ||
            args.int(1) != snapshot.selection.endExclusive) throw Win32TextException(0x80040206.toInt())
        Win32TextComAbi.requirePointer(args.pointer(3))
        Win32TextComAbi.requirePointer(args.pointer(4))
        val rect = cursor.second
        val right = rect.x.toLong() + rect.width
        val bottom = rect.y.toLong() + rect.height
        if (right !in Int.MIN_VALUE..Int.MAX_VALUE || bottom !in Int.MIN_VALUE..Int.MAX_VALUE) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
        val output = args.pointer(3).reinterpret(16)
        intArrayOf(rect.x, rect.y, right.toInt(), bottom.toInt()).forEachIndexed { index, value -> output.set(ValueLayout.JAVA_INT, index * 4L, value) }
        Win32TextComAbi.writeInt(args.pointer(4), 0)
        return 0
    }

    private fun screenExtent(args: Array<Any>): Int = Arena.ofConfined().use { arena ->
        if (args.int(0) != 1) return Win32TextDocument.INVALID_ARGUMENT
        Win32TextComAbi.requirePointer(args.pointer(1))
        val rect = arena.allocate(16, 4)
        val origin = arena.allocate(8, 4)
        val hwnd = MemorySegment.ofAddress(owner.hwnd)
        if (GetClientRect(hwnd, rect) == 0 || ClientToScreen(hwnd, origin) == 0) return 0x80004005.toInt()
        val x = origin.get(ValueLayout.JAVA_INT, 0)
        val y = origin.get(ValueLayout.JAVA_INT, 4)
        val right = x.toLong() + rect.get(ValueLayout.JAVA_INT, 8)
        val bottom = y.toLong() + rect.get(ValueLayout.JAVA_INT, 12)
        if (right !in Int.MIN_VALUE..Int.MAX_VALUE || bottom !in Int.MIN_VALUE..Int.MAX_VALUE) return Win32TextDocument.INVALID_ARGUMENT
        val output = args.pointer(1).reinterpret(16)
        intArrayOf(x, y, right.toInt(), bottom.toInt()).forEachIndexed { index, value -> output.set(ValueLayout.JAVA_INT, index * 4L, value) }
        0
    }

    private fun requestAttributes(slot: Int, args: Array<Any>): Int {
        if (slot != 18) { val snapshot = document.read(); checkRange(args.int(0), args.int(0), snapshot.text.length) }
        val count = args.int(1)
        checkCount(count, limits.maxCollectionElements)
        if (count > 0) Win32TextComAbi.requirePointer(args.pointer(2))
        val attributes = if (count == 0) MemorySegment.NULL else args.pointer(2).reinterpret(count.toLong() * 16)
        owner.requestedScope = (0 until count).any { Win32TextComAbi.matches(attributes.asSlice(it * 16L, 16), Win32TextComAbi.INPUT_SCOPE_ATTRIBUTE) }
        return 0
    }

    private fun retrieveAttributes(args: Array<Any>): Int = Arena.ofConfined().use { arena ->
        val count = args.int(0)
        checkCount(count, limits.maxCollectionElements)
        Win32TextComAbi.requirePointer(args.pointer(2))
        if (count == 0 || !owner.requestedScope) return 0
        Win32TextComAbi.requirePointer(args.pointer(1))
        val result = args.pointer(1).reinterpret(48).fill(0) // TS_ATTRVAL: GUID, DWORD, pad, VARIANT(24).
        MemorySegment.copy(Win32TextComAbi.guid(arena, Win32TextComAbi.INPUT_SCOPE_ATTRIBUTE), 0, result, 0, 16)
        val scope = Win32TextComAbi.query(owner.address, Win32TextComAbi.INPUT_SCOPE)
        result.set(ValueLayout.JAVA_SHORT, 24, 13.toShort()) // VT_UNKNOWN; the caller releases it.
        result.set(ValueLayout.ADDRESS, 32, MemorySegment.ofAddress(scope))
        Win32TextComAbi.writeInt(args.pointer(2), 1)
        owner.requestedScope = false
        0
    }

    fun composition(slot: Int, args: Array<Any>): Int = when (slot) {
        3 -> {
            Win32TextComAbi.requirePointer(args.pointer(0)); Win32TextComAbi.requirePointer(args.pointer(1))
            if (owner.compositionView == 0L) {
                Win32TextComAbi.addRef(args.pointer(0).address())
                owner.compositionView = args.pointer(0).address()
                Win32TextComAbi.writeInt(args.pointer(1), 1)
            }
            0
        }
        4 -> 0 // Final ranges are read under the write lock, after all edits have completed.
        5 -> {
            val old = owner.compositionView
            owner.compositionView = 0
            Win32TextComAbi.release(old)
            0
        }
        else -> 0x80004001.toInt()
    }

    fun syncComposition() {
        if (owner.compositionView == 0L) { document.setComposition(null, null); return }
        Arena.ofConfined().use { arena ->
            Win32ComResources().use { refs ->
                val output = arena.allocate(ValueLayout.ADDRESS)
                Win32TextComAbi.check(Win32TextComAbi.call(owner.compositionView, 4, "p", output))
                val range = refs.own(output.get(ValueLayout.ADDRESS, 0).address(), Win32TextComAbi::release)
                val acp = refs.own(Win32TextComAbi.query(range, Win32TextComAbi.RANGE_ACP), Win32TextComAbi::release)
                val start = arena.allocate(4, 4)
                val length = arena.allocate(4, 4)
                Win32TextComAbi.check(Win32TextComAbi.call(acp, 25, "pp", start, length))
                val from = start.get(ValueLayout.JAVA_INT, 0)
                val count = length.get(ValueLayout.JAVA_INT, 0)
                val selection = document.read().selection
                if (from < 0 || count < 0 || from.toLong() + count > Int.MAX_VALUE || selection.start < from || selection.endExclusive.toLong() > from.toLong() + count)
                    throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
                document.setComposition(Win32TextRange(from, from + count), Win32TextRange(selection.start - from, selection.endExclusive - from))
            }
        }
    }

    fun inputScope(slot: Int, args: Array<Any>): Int {
        if (slot != 3) return 0x80004001.toInt()
        Win32TextComAbi.requirePointer(args.pointer(0)); Win32TextComAbi.requirePointer(args.pointer(1))
        val value = when (owner.configuration.purpose) {
            Win32TextPurpose.Text -> 0; Win32TextPurpose.Name -> 7; Win32TextPurpose.Email -> 5
            Win32TextPurpose.Url -> 1; Win32TextPurpose.Telephone -> 32; Win32TextPurpose.Number -> 28
            Win32TextPurpose.Decimal -> 29; Win32TextPurpose.Password -> 31
        }
        val native = CoTaskMemAlloc(4)
        if (native.address() == 0L) throw Win32TextException(Win32TextDocument.OUT_OF_MEMORY)
        native.reinterpret(4).set(ValueLayout.JAVA_INT, 0, value)
        Win32TextComAbi.writePointer(args.pointer(0), native.address())
        Win32TextComAbi.writeInt(args.pointer(1), 1)
        return 0
    }

    private fun checkRange(start: Int, end: Int, length: Int) {
        if (start < 0 || end < start || end > length) throw Win32TextException(0x80040200.toInt())
    }
    private fun checkCount(count: Int, maximum: Int) {
        if (count < 0 || count > maximum) throw Win32TextException(Win32TextDocument.INVALID_ARGUMENT)
    }
    private fun Array<Any>.pointer(index: Int): MemorySegment = this[index] as MemorySegment
    private fun Array<Any>.int(index: Int): Int = this[index] as Int
}
