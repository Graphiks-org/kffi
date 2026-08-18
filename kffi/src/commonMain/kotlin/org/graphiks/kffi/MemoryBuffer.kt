package org.graphiks.kffi

/**
 * Buffer bounded to a native address.
 *
 * ## Memory contract
 * - Every typed access (scalar or array) is checked: offset + elementSize ≤ size.
 * - An out-of-bounds access throws [IndexOutOfBoundsException] with offset and size in the message.
 * - [unsafe] = true skips bounds checks (opt-in per allocator or buffer): every
 *   out-of-bounds access becomes UB. The default is false (bounds checks enabled).
 * - A bare `NativeAddress` is not inherently bounded; every typed access goes
 *   through a bounded `MemoryBuffer` or uses the unsafe option.
 * - Lifetime: a buffer created through [MemoryAllocator] throws
 *   IllegalStateException on use after close (JVM); access after close for a
 *   buffer created from a raw address is not detected (documented UB, matching
 *   Android/native behavior).
 * - Aliasing: two buffers over the same memory region observe one another; no
 *   locking is provided.
 */
@OptIn(ExperimentalUnsignedTypes::class)
expect class MemoryBuffer(handler: NativeAddress, size: ULong, unsafe: Boolean = false) {
    val size: ULong
    val handler: NativeAddress

    fun writeByte(value: Byte, offset: ULong = 0uL)
    fun readByte(offset: ULong = 0uL): Byte

    fun writeUByte(value: UByte, offset: ULong = 0uL)
    fun readUByte(offset: ULong = 0uL): UByte

    fun writeShort(value: Short, offset: ULong = 0uL)
    fun readShort(offset: ULong = 0uL): Short

    fun writeUShort(value: UShort, offset: ULong = 0uL)
    fun readUShort(offset: ULong = 0uL): UShort

    fun writeInt(value: Int, offset: ULong = 0uL)
    fun readInt(offset: ULong = 0uL): Int

    fun writeUInt(value: UInt, offset: ULong = 0uL)
    fun readUInt(offset: ULong = 0uL): UInt

    fun writeLong(value: Long, offset: ULong = 0uL)
    fun readLong(offset: ULong = 0uL): Long

    fun writeULong(value: ULong, offset: ULong = 0uL)
    fun readULong(offset: ULong = 0uL): ULong

    fun writeFloat(value: Float, offset: ULong = 0uL)
    fun readFloat(offset: ULong = 0uL): Float

    fun writeDouble(value: Double, offset: ULong = 0uL)
    fun readDouble(offset: ULong = 0uL): Double

    fun writePointer(value: NativeAddress, offset: ULong = 0uL)
    fun readPointer(offset: ULong = 0uL): NativeAddress

    fun writeBytes(array: ByteArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readBytes(array: ByteArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeUBytes(array: UByteArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readUBytes(array: UByteArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeShorts(array: ShortArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readShorts(array: ShortArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeUShorts(array: UShortArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readUShorts(array: UShortArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeInts(array: IntArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readInts(array: IntArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeUInts(array: UIntArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readUInts(array: UIntArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeLongs(array: LongArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readLongs(array: LongArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeULongs(array: ULongArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readULongs(array: ULongArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeFloats(array: FloatArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readFloats(array: FloatArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())

    fun writeDoubles(array: DoubleArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
    fun readDoubles(array: DoubleArray, arrayIndex: ULong = 0u, bufferOffset: ULong = 0uL, size: ULong = array.size.toULong())
}
