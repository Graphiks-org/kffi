package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertFailsWith

class LinuxPosixValidationTest {
    @Test
    fun readRejectsNegativeAndOversizedByteCountsBeforeNativeInvocation() {
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.read(fd = -1, destination = MemorySegment.NULL, byteCount = -1)
        }
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.read(fd = -1, destination = MemorySegment.NULL, byteCount = 1)
        }
    }

    @Test
    fun writeRejectsNegativeAndOversizedByteCountsBeforeNativeInvocation() {
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.write(fd = -1, source = MemorySegment.NULL, byteCount = -1)
        }
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.write(fd = -1, source = MemorySegment.NULL, byteCount = 1)
        }
    }

    @Test
    fun pollRejectsNegativeCountBeforeNativeInvocation() {
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.poll(descriptors = MemorySegment.NULL, count = -1, timeoutMillis = 0)
        }
    }

    @Test
    fun pollRejectsCountBeyondSegmentCapacityBeforeNativeInvocation() {
        assertFailsWith<IllegalArgumentException> {
            LinuxPosix.poll(descriptors = MemorySegment.NULL, count = 1, timeoutMillis = 0)
        }
    }

    @Test
    fun pollRejectsTimeoutBelowMinusOneBeforeNativeInvocation() {
        Arena.ofConfined().use { arena ->
            val descriptor = PollFd.allocate(arena, 1)
            PollFd.set(descriptor, index = 0, fd = Int.MAX_VALUE, events = 0)
            assertFailsWith<IllegalArgumentException> {
                LinuxPosix.poll(descriptors = descriptor, count = 1, timeoutMillis = -2)
            }
        }
    }

    @Test
    fun pollFdRetainsItsArgumentValidation() {
        assertFailsWith<IllegalArgumentException> {
            PollFd.poll(segment = MemorySegment.NULL, count = -1, timeoutMillis = 0)
        }
        assertFailsWith<IllegalArgumentException> {
            PollFd.poll(segment = MemorySegment.NULL, count = 0, timeoutMillis = -2)
        }
    }
}
