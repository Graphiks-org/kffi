package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PollFdTest {
    @Test
    fun pollReportsReventsForEachReadyDescriptor() {
        if (!isLinux()) return

        val first = LinuxPosix.pipe()
        try {
            val second = LinuxPosix.pipe()
            try {
                Arena.ofConfined().use { arena ->
                    val fds = PollFd.allocate(arena, 2)
                    PollFd.set(fds, 0, first.readFd, PollFd.POLLIN)
                    PollFd.set(fds, 1, second.readFd, PollFd.POLLIN)
                    val byte = arena.allocateFrom(ValueLayout.JAVA_BYTE, 1)

                    LinuxPosix.write(second.writeFd, byte)

                    assertEquals(1, PollFd.poll(fds, 2, 1_000))
                    assertEquals(0, PollFd.revents(fds, 0).toInt() and PollFd.POLLIN.toInt())
                    assertNotEquals(0, PollFd.revents(fds, 1).toInt() and PollFd.POLLIN.toInt())
                }
            } finally {
                listOf(second.readFd, second.writeFd).forEach(LinuxPosix::close)
            }
        } finally {
            listOf(first.readFd, first.writeFd).forEach(LinuxPosix::close)
        }
    }

    @Test
    fun pollReportsHangupWhenPipeWriterIsClosed() {
        if (!isLinux()) return

        val pipe = LinuxPosix.pipe()
        try {
            LinuxPosix.close(pipe.writeFd)
            Arena.ofConfined().use { arena ->
                val fds = PollFd.allocate(arena, 1)
                PollFd.set(fds, 0, pipe.readFd, PollFd.POLLIN)

                assertEquals(1, PollFd.poll(fds, 1, 1_000))
                assertNotEquals(0, PollFd.revents(fds, 0).toInt() and PollFd.POLLHUP.toInt())
            }
        } finally {
            LinuxPosix.close(pipe.readFd)
        }
    }

    @Test
    fun pollTimeoutReturnsZeroAndLeavesReventsClear() {
        if (!isLinux()) return

        val pipe = LinuxPosix.pipe()
        try {
            Arena.ofConfined().use { arena ->
                val fds = PollFd.allocate(arena, 1)
                PollFd.set(fds, 0, pipe.readFd, PollFd.POLLIN)

                assertEquals(0, PollFd.poll(fds, 1, 0))
                assertEquals(0, PollFd.revents(fds, 0).toInt())
            }
        } finally {
            LinuxPosix.close(pipe.readFd)
            LinuxPosix.close(pipe.writeFd)
        }
    }

    private fun isLinux(): Boolean = System.getProperty("os.name") == "Linux"
}
