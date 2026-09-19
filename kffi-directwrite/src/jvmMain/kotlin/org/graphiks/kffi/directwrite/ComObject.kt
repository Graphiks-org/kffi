package org.graphiks.kffi.directwrite

import org.graphiks.kffi.engine.JvmDowncallEngine
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

/**
 * Minimal COM interface handle for vtable dispatch on top of [JvmDowncallEngine].
 *
 * A COM interface pointer points at a pointer-sized slot holding the address of
 * the interface's vtable. A method at vtable index `i` is the function pointer
 * at byte offset `i * 8`, and its first argument is the interface pointer
 * itself. This type resolves vtable slots lazily (cached per index) and invokes
 * them through the generic downcall engine, which caches the FFM
 * `MethodHandle` per function address and shape.
 *
 * The caller owns the interface pointer's lifetime and must call [release] once
 * per retained reference. This class does not AddRef; it assumes ownership of
 * the reference it is constructed with.
 */
internal class ComObject(internal val pointer: Long) {

    init {
        require(pointer != 0L) { "COM interface pointer must not be null" }
    }

    private val slots = java.util.concurrent.ConcurrentHashMap<Int, Long>()

    /** Resolves the function address at vtable [index]. */
    fun slot(index: Int): Long = slots.getOrPut(index) {
        val vtable = MemorySegment.ofAddress(pointer)
            .reinterpret(POINTER_BYTES)
            .get(ValueLayout.ADDRESS, 0L)
            .address()
        require(vtable != 0L) { "COM vtable pointer must not be null" }
        MemorySegment.ofAddress(vtable)
            .reinterpret(((index + 1) * POINTER_BYTES))
            .get(ValueLayout.ADDRESS, index * POINTER_BYTES)
            .address()
    }

    /**
     * Invokes vtable [index] with the interface pointer prepended to [args].
     * [result] is the ABI carrier of the method's return type.
     */
    fun call(result: JvmDowncallEngine.AbiType, index: Int, argumentTypes: List<JvmDowncallEngine.AbiType>, vararg args: Any?): Any? {
        val invocation = arrayOfNulls<Any?>(args.size + 1)
        invocation[0] = pointer
        args.copyInto(invocation, destinationOffset = 1)
        val shape = JvmDowncallEngine.FunctionShape(
            result,
            listOf(JvmDowncallEngine.AbiType.Pointer) + argumentTypes,
        )
        return JvmDowncallEngine.callGeneric(slot(index), shape, *invocation)
    }

    /** Invokes a method returning an `HRESULT`. */
    fun hresult(index: Int, argumentTypes: List<JvmDowncallEngine.AbiType> = emptyList(), vararg args: Any?): Int =
        call(JvmDowncallEngine.AbiType.I32, index, argumentTypes, *args) as Int

    /** Invokes a method returning an unsigned 32-bit count or enum. */
    fun uint32(index: Int): Int =
        call(JvmDowncallEngine.AbiType.I32, index, emptyList()) as Int

    /** Releases one retained reference (`IUnknown::Release`, vtable slot 2). */
    fun release() {
        call(JvmDowncallEngine.AbiType.I32, RELEASE_SLOT, emptyList())
    }

    private companion object {
        const val POINTER_BYTES = 8L
        const val RELEASE_SLOT = 2
    }
}
