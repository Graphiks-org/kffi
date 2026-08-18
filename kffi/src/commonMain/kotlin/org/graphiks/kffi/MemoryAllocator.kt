package org.graphiks.kffi

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

val globalMemory = MemoryAllocator()

/**
 * Confined-arena allocator.
 * [unsafe] = true propagates the unsafe option to every buffer created by this
 * allocator (bounds checks are skipped). The default is false.
 * Native note: unsafe is fixed at compilation time (a build-time constant; see
 * MemoryBuffer.native.kt), so native distributions cannot switch it at runtime;
 * the flag is accepted for API compatibility and has no effect.
 */
expect class MemoryAllocator(unsafe: Boolean = false) : AutoCloseable {

    fun allocate(sizeInByte: Long): NativeAddress

    override fun close()

    fun bufferOf(value: Long): MemoryBuffer

    fun allocateFrom(value: String): CString
    fun bufferOfAddress(value: NativeAddress): MemoryBuffer
    fun bufferOfAddresses(value: List<NativeAddress>): MemoryBuffer
    fun allocateBuffer(size: ULong): MemoryBuffer
}

@OptIn(kotlin.contracts.ExperimentalContracts::class)
public inline fun <R> memoryScope(block: (allocator: MemoryAllocator) -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val memoryAllocator = MemoryAllocator()
    try {
        return block(memoryAllocator)
    } finally {
        memoryAllocator.close()
    }
}
