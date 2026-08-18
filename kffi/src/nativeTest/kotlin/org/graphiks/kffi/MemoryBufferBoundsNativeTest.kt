package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec

class MemoryBufferBoundsNativeTest : FreeSpec({

    "unsafe flag is a compile-time constant on native" {
        // The native distribution is fixed: the runtime flag is ignored.
        // This test documents the default bounded-distribution behavior.
        memoryScope { scope ->
            val buffer = scope.allocateBuffer(8u)
            shouldThrow<IndexOutOfBoundsException> {
                buffer.readLong(8u)
            }
        }
    }

    "allocator unsafe flag is accepted for API compatibility (no runtime effect)" {
        val allocator = MemoryAllocator(unsafe = true)
        val buffer = allocator.allocateBuffer(8u)
        shouldThrow<IndexOutOfBoundsException> {
            buffer.readLong(8u)
        }
        allocator.close()
    }
})
