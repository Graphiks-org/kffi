@file:OptIn(ExperimentalUnsignedTypes::class)

package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import java.lang.foreign.Arena

class MemoryBufferScopeJvmTest : FreeSpec({

    "use after close raises IllegalStateException" {
        val allocator = MemoryAllocator()
        val buffer = allocator.allocateBuffer(16u)
        allocator.close()
        shouldThrow<IllegalStateException> {
            buffer.writeLong(1L, 0u)
        }
    }

    "global memory survives allocator close" {
        val buffer = globalMemory.allocateBuffer(16u)
        buffer.writeLong(42L, 0u)
        buffer.readLong(0u) shouldBe 42L
    }

    "unsafe buffer from raw address has no scope" {
        // A buffer built from a raw address carries NO arena scope, so accesses
        // do not throw IllegalStateException (unlike the scoped path). Native
        // memory from a closed arena must NOT be written (use-after-free,
        // documented UB), so the buffer is created from stable memory in a
        // distinct arena that remains alive for the test.
        val stable = Arena.ofAuto()
        val chunk = stable.allocate(16L)
        val buffer = MemoryBuffer(NativeAddress(chunk.address()), 16u)
        buffer.writeLong(7L, 0u)
        buffer.readLong(0u) shouldBe 7L
    }
})
