@file:OptIn(ExperimentalUnsignedTypes::class)

package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

class MemoryBufferUnsafeJvmTest : FreeSpec({

    "unsafe buffer skips logical bounds checks within its backing allocation" {
        memoryScope { scope ->
            val backing = scope.allocateBuffer(80u)
            val buffer = MemoryBuffer(backing.handler, 8u, unsafe = true)
            // The access is outside the logical 8-byte buffer but inside the
            // 80-byte backing allocation, so it exercises unsafe mode without UB.
            buffer.writeLong(1L, 64u)
            buffer.readLong(64u) shouldBe 1L
        }
    }

    "unsafe buffer from raw address has no bounds checks" {
        memoryScope { scope ->
            val backing = scope.allocateBuffer(64u)
            val unsafeBuffer = MemoryBuffer(backing.handler, 8u, unsafe = true)
            // The access exceeds the unsafe buffer but remains in the backing allocation — no exception.
            unsafeBuffer.writeLong(7L, 8u)
        }
    }

    "default (safe) buffer still bounds-checks" {
        memoryScope { scope ->
            val buffer = scope.allocateBuffer(8u)
            shouldThrow<IndexOutOfBoundsException> {
                buffer.readLong(8u)
            }
        }
    }

    "scoped buffer retains use-after-close detection even in unsafe mode" {
        val allocator = MemoryAllocator(unsafe = true)
        val buffer = allocator.allocateBuffer(8u)
        allocator.close()
        shouldThrow<IllegalStateException> {
            buffer.writeLong(1L, 0u)
        }
    }

    "unsafe array path round-trips and skips array bounds checks" {
        memoryScope { scope ->
            val backing = scope.allocateBuffer(24u)
            val buffer = MemoryBuffer(backing.handler, 16u, unsafe = true)
            // 3 longs exceed the logical 16-byte buffer but fit in the backing
            // allocation, so the unsafe array path is tested without UB.
            buffer.writeLongs(longArrayOf(1L, 2L, 3L))
            buffer.readLong(0u) shouldBe 1L
            buffer.readLong(8u) shouldBe 2L
            buffer.readLong(16u) shouldBe 3L
        }
    }
})
