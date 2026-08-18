package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldContain

class MemoryBufferBoundsCommonTest : FreeSpec({

    "every scalar family read throws with offset AND size in message" {
        memoryScope { scope ->
            // Distinct values by width: offset < size, and both must appear.
            val buffer = scope.allocateBuffer(16u)
            // 1 byte: offset 17 + 1 > 16, offset ≠ size (distinct).
            shouldThrow<IndexOutOfBoundsException> { buffer.readByte(17u) }
                .message.shouldContain("17").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readUByte(17u) }
                .message.shouldContain("17").shouldContain("16")
            // 2 bytes: offset 15 + 2 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.readShort(15u) }
                .message.shouldContain("15").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readUShort(15u) }
                .message.shouldContain("15").shouldContain("16")
            // 4 bytes: offset 13 + 4 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.readInt(13u) }
                .message.shouldContain("13").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readUInt(13u) }
                .message.shouldContain("13").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readFloat(13u) }
                .message.shouldContain("13").shouldContain("16")
            // 8 bytes: offset 10 + 8 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.readLong(10u) }
                .message.shouldContain("10").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readULong(10u) }
                .message.shouldContain("10").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.readDouble(10u) }
                .message.shouldContain("10").shouldContain("16")
            // Pointer: offset 17 + 8 > 16, offset ≠ size (distinct).
            shouldThrow<IndexOutOfBoundsException> { buffer.readPointer(17u) }
                .message.shouldContain("17").shouldContain("16")
        }
    }

    "write crossing end throws with offset AND size in message" {
        memoryScope { scope ->
            // Distinct values by width: offset < size, and both must appear.
            val buffer = scope.allocateBuffer(16u)
            // 1 byte: offset 17 + 1 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.writeByte(1, 17u) }
                .message.shouldContain("17").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeUByte(1u, 17u) }
                .message.shouldContain("17").shouldContain("16")
            // 2 bytes: offset 15 + 2 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.writeShort(1, 15u) }
                .message.shouldContain("15").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeUShort(1u, 15u) }
                .message.shouldContain("15").shouldContain("16")
            // 4 bytes: offset 14 + 4 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.writeInt(1, 14u) }
                .message.shouldContain("14").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeUInt(1u, 14u) }
                .message.shouldContain("14").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeFloat(1.0f, 13u) }
                .message.shouldContain("13").shouldContain("16")
            // 8 bytes: offset 10 + 8 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.writeLong(1L, 10u) }
                .message.shouldContain("10").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeULong(1uL, 10u) }
                .message.shouldContain("10").shouldContain("16")
            shouldThrow<IndexOutOfBoundsException> { buffer.writeDouble(1.0, 10u) }
                .message.shouldContain("10").shouldContain("16")
            // Pointer: offset 10 + 8 > 16.
            shouldThrow<IndexOutOfBoundsException> { buffer.writePointer(NativeAddress(0xCAFEL), 10u) }
                .message.shouldContain("10").shouldContain("16")
        }
    }

    // Array-message prefixes deliberately differ between backends (native emits
    // "array access" through a shared read/write helper; JVM/Android emit
    // "array read"/"array write"). The contract pins numeric fields
    // (bufferOffset/bytes/size), not the exact label.
    "array write crossing the end throws IndexOutOfBoundsException" {
        memoryScope { scope ->
            val buffer = scope.allocateBuffer(16u)
            shouldThrow<IndexOutOfBoundsException> {
                buffer.writeInts(IntArray(4), bufferOffset = 12u) // 12 + 16 > 16
            }.message
                .shouldContain("bufferOffset=").shouldContain("bytes=").shouldContain("size=")
                .shouldContain("12").shouldContain("16")
        }
    }

    "array read crossing the end throws (read path, not just write)" {
        memoryScope { scope ->
            val buffer = scope.allocateBuffer(16u)
            shouldThrow<IndexOutOfBoundsException> {
                buffer.readInts(IntArray(4), bufferOffset = 12u) // 12 + 16 > 16
            }.message
                .shouldContain("bufferOffset=").shouldContain("bytes=").shouldContain("size=")
                .shouldContain("12").shouldContain("16")
            // bytes (8) and size (16) are distinct: all three values are asserted.
            shouldThrow<IndexOutOfBoundsException> {
                buffer.readBytes(ByteArray(8), bufferOffset = 12u) // 12 + 8 > 16
            }.message
                .shouldContain("bufferOffset=").shouldContain("bytes=").shouldContain("size=")
                .shouldContain("12").shouldContain("8").shouldContain("16")
        }
    }

    "boundary access at exactly size is allowed (inclusive upper bound)" {
        memoryScope { scope ->
            val buffer = scope.allocateBuffer(8u)
            buffer.writeLong(0xCAFE, 0u) // offset 0 + 8 = 8 ≤ 8: allowed.
            buffer.readLong(0u) shouldBe 0xCAFE
            buffer.writeInt(0xBEEF, 4u) // offset 4 + 4 = 8 ≤ 8: allowed (non-zero offset).
            buffer.readInt(4u) shouldBe 0xBEEF
        }
    }
})
