package org.graphiks.kffi.posix

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.Test
import kotlin.test.assertEquals

class LinuxPosixDescriptorTest {
    @Test
    fun pipeTransfersBytesThroughPublicDescriptorOperations() {
        if (!isLinux()) return

        val (readFd, writeFd) = LinuxPosix.pipe2(LinuxPosix.O_CLOEXEC)
        try {
            Arena.ofConfined().use { arena ->
                val source = arena.allocateFrom(ValueLayout.JAVA_BYTE, 7)
                val target = arena.allocate(ValueLayout.JAVA_BYTE)
                assertEquals(1, LinuxPosix.write(writeFd, source))
                assertEquals(1, LinuxPosix.read(readFd, target))
                assertEquals(7, target.get(ValueLayout.JAVA_BYTE, 0).toInt())
            }
        } finally {
            LinuxPosix.close(readFd)
            LinuxPosix.close(writeFd)
        }
    }

    @Test
    fun eventFdTransfersNativeOrderCounterThroughPublicDescriptorOperations() {
        if (!isLinux()) return

        val fd = LinuxPosix.eventfd(initialValue = 0, flags = 0)
        try {
            Arena.ofConfined().use { arena ->
                val source = arena.allocate(ValueLayout.JAVA_LONG)
                val target = arena.allocate(ValueLayout.JAVA_LONG)
                source.set(ValueLayout.JAVA_LONG, 0, 7L)

                assertEquals(Long.SIZE_BYTES.toLong(), LinuxPosix.write(fd, source))
                assertEquals(Long.SIZE_BYTES.toLong(), LinuxPosix.read(fd, target))
                assertEquals(7L, target.get(ValueLayout.JAVA_LONG, 0))
            }
        } finally {
            LinuxPosix.close(fd)
        }
    }

    @Test
    fun systemVSharedMemoryCanBeAttachedWrittenDetachedAndRemoved() {
        if (!isLinux()) return

        val shmid = LinuxPosix.shmget(
            key = LinuxPosix.IPC_PRIVATE,
            size = 4096,
            flags = LinuxPosix.IPC_CREAT or 0b110_000_000,
        )
        try {
            val mapping = LinuxPosix.shmat(shmid)
            try {
                val writableMapping = mapping.reinterpret(4096)
                writableMapping.set(ValueLayout.JAVA_INT, 0, 7)
                assertEquals(7, writableMapping.get(ValueLayout.JAVA_INT, 0))
            } finally {
                LinuxPosix.shmdt(mapping)
            }
        } finally {
            LinuxPosix.shmctl(shmid, LinuxPosix.IPC_RMID)
        }
    }

    private fun isLinux(): Boolean = System.getProperty("os.name") == "Linux"
}
