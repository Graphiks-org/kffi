package org.graphiks.kffi

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec

class MemoryBufferBoundsNativeTest : FreeSpec({
    "allocator unsafe flag is accepted for API compatibility (no runtime effect)" {
        val allocator = MemoryAllocator(unsafe = true)
        val buffer = allocator.allocateBuffer(8u)
        shouldThrow<IndexOutOfBoundsException> {
            buffer.readLong(8u)
        }
        allocator.close()
    }
})
