package org.graphiks.kffi.posix

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.UUID
import org.graphiks.kffi.posix.generated.close
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LinuxPosixMemoryTest {
    @Test
    fun anonymousMappingIsWritableAndCanBeUnmapped() {
        if (!isLinux()) return

        val mapping = LinuxPosix.mmap(
            MemorySegment.NULL,
            4096,
            LinuxPosix.PROT_READ or LinuxPosix.PROT_WRITE,
            LinuxPosix.MAP_PRIVATE or LinuxPosix.MAP_ANONYMOUS,
            -1,
            0,
        )
        try {
            mapping.set(ValueLayout.JAVA_INT, 0, 42)
            assertEquals(42, mapping.get(ValueLayout.JAVA_INT, 0))
        } finally {
            LinuxPosix.munmap(mapping, 4096)
        }
    }

    @Test
    fun zeroLengthMappingReportsCapturedEinval() {
        if (!isLinux()) return

        val failure = assertFailsWith<PosixException> {
            LinuxPosix.mmap(
                MemorySegment.NULL,
                0,
                LinuxPosix.PROT_READ,
                LinuxPosix.MAP_PRIVATE or LinuxPosix.MAP_ANONYMOUS,
                -1,
                0,
            )
        }
        assertEquals("mmap", failure.operation)
        assertEquals(LinuxErrno.EINVAL, failure.errno)
    }

    @Test
    fun sharedMemoryMappingIsWritableAndCanBeUnlinked() {
        if (!isLinux()) return

        val name = "/kffi-${UUID.randomUUID()}"
        try {
            val fd = LinuxPosix.shmOpen(
                name,
                LinuxPosix.O_RDWR or LinuxPosix.O_CREAT or LinuxPosix.O_EXCL,
                0b110_000_000,
            )
            try {
                LinuxPosix.ftruncate(fd, 4096)
                val mapping = LinuxPosix.mmap(
                    MemorySegment.NULL,
                    4096,
                    LinuxPosix.PROT_READ or LinuxPosix.PROT_WRITE,
                    LinuxPosix.MAP_SHARED,
                    fd,
                    0,
                )
                try {
                    mapping.set(ValueLayout.JAVA_INT, 0, 7)
                    assertEquals(7, mapping.get(ValueLayout.JAVA_INT, 0))
                } finally {
                    LinuxPosix.munmap(mapping, 4096)
                }
            } finally {
                close(fd)
            }
        } finally {
            LinuxPosix.shmUnlink(name)
        }
    }

    @Test
    fun memfdMappingIsWritableAndCanBeUnmapped() {
        if (!isLinux()) return

        val fd = LinuxPosix.memfdCreate("kffi-${UUID.randomUUID()}", 0)
        try {
            LinuxPosix.ftruncate(fd, 4096)
            val mapping = LinuxPosix.mmap(
                MemorySegment.NULL,
                4096,
                LinuxPosix.PROT_READ or LinuxPosix.PROT_WRITE,
                LinuxPosix.MAP_SHARED,
                fd,
                0,
            )
            try {
                mapping.set(ValueLayout.JAVA_INT, 0, 9)
                assertEquals(9, mapping.get(ValueLayout.JAVA_INT, 0))
            } finally {
                LinuxPosix.munmap(mapping, 4096)
            }
        } finally {
            close(fd)
        }
    }

    private fun isLinux(): Boolean = System.getProperty("os.name") == "Linux"
}
