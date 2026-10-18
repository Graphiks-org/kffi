package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.UUID

/** Win64 COM uses 32-bit HRESULT/ULONG and pointer-sized interface addresses. */
internal object Win32TextComAbi {
    const val UNKNOWN = "00000000-0000-0000-c000-000000000046"
    const val TEXT_STORE = "28888fe3-c2a0-483a-a3ea-8cb1ce51ff3d"
    const val TEXT_SINK = "22d44c94-a419-4542-a272-ae26093ececf"
    const val COMPOSITION_SINK = "5f20aa40-b57a-4f34-96ab-3576f377cc79"
    const val INPUT_SCOPE = "fde1eaee-6924-4cdf-91e7-da38cff5559d"
    const val INPUT_SCOPE_ATTRIBUTE = "1713dd5a-68e7-4a5b-9af6-592a595c778d"
    const val THREAD_MANAGER = "aa80e801-2021-11d2-93e0-0060b067b86e"
    const val THREAD_MANAGER_CLASS = "529a9e6b-6587-4f23-ab9e-9c7d683e3c50"
    const val KEYSTROKE_MANAGER = "aa80e7f0-2021-11d2-93e0-0060b067b86e"
    const val RANGE_ACP = "057a6296-029b-4154-b79a-0d461d4ea94c"

    val linker: Linker = Linker.nativeLinker()
    fun descriptor(signature: String): FunctionDescriptor = FunctionDescriptor.of(ValueLayout.JAVA_INT,
        ValueLayout.ADDRESS, *signature.map {
            when (it) { 'p' -> ValueLayout.ADDRESS; 'i' -> ValueLayout.JAVA_INT; 'l' -> ValueLayout.JAVA_LONG; else -> error("Unknown COM carrier") }
        }.toTypedArray())

    fun call(address: Long, slot: Int, signature: String, vararg arguments: Any): Int {
        if (address == 0L) throw Win32TextException(0x80004003.toInt())
        val receiver = MemorySegment.ofAddress(address)
        val vtable = receiver.reinterpret(8).get(ValueLayout.ADDRESS, 0)
        val function = vtable.reinterpret((slot + 1L) * 8).get(ValueLayout.ADDRESS, slot * 8L)
        return linker.downcallHandle(function, descriptor(signature))
            .invokeWithArguments(listOf(receiver) + arguments.toList()) as Int
    }

    fun query(address: Long, iid: String): Long = Arena.ofConfined().use { arena ->
        val output = arena.allocate(ValueLayout.ADDRESS)
        check(call(address, 0, "pp", guid(arena, iid), output))
        output.get(ValueLayout.ADDRESS, 0).address().also { if (it == 0L) throw Win32TextException(0x80004003.toInt()) }
    }

    fun release(address: Long) { if (address != 0L) call(address, 2, "") }
    fun addRef(address: Long) { if (address != 0L) call(address, 1, "") }
    fun check(result: Int) { if (result < 0) throw Win32TextException(result) }

    fun guid(arena: Arena, value: String): MemorySegment {
        val uuid = UUID.fromString(value)
        val output = arena.allocate(16, 4)
        output.set(ValueLayout.JAVA_INT, 0, (uuid.mostSignificantBits ushr 32).toInt())
        output.set(ValueLayout.JAVA_SHORT, 4, (uuid.mostSignificantBits ushr 16).toShort())
        output.set(ValueLayout.JAVA_SHORT, 6, uuid.mostSignificantBits.toShort())
        repeat(8) { output.set(ValueLayout.JAVA_BYTE, 8 + it.toLong(), (uuid.leastSignificantBits ushr (56 - it * 8)).toByte()) }
        return output
    }

    fun matches(pointer: MemorySegment, value: String): Boolean {
        if (pointer.address() == 0L) return false
        val uuid = UUID.fromString(value)
        val data = pointer.reinterpret(16)
        if (data.get(ValueLayout.JAVA_INT, 0) != (uuid.mostSignificantBits ushr 32).toInt() ||
            data.get(ValueLayout.JAVA_SHORT, 4) != (uuid.mostSignificantBits ushr 16).toShort() ||
            data.get(ValueLayout.JAVA_SHORT, 6) != uuid.mostSignificantBits.toShort()) return false
        return (0..7).all { data.get(ValueLayout.JAVA_BYTE, 8 + it.toLong()) == (uuid.leastSignificantBits ushr (56 - it * 8)).toByte() }
    }

    fun writeInt(pointer: MemorySegment, value: Int) {
        if (pointer.address() != 0L) pointer.reinterpret(4).set(ValueLayout.JAVA_INT, 0, value)
    }
    fun writePointer(pointer: MemorySegment, value: Long) {
        if (pointer.address() != 0L) pointer.reinterpret(8).set(ValueLayout.ADDRESS, 0, MemorySegment.ofAddress(value))
    }
    fun requirePointer(pointer: MemorySegment) { if (pointer.address() == 0L) throw Win32TextException(0x80004003.toInt()) }
}
