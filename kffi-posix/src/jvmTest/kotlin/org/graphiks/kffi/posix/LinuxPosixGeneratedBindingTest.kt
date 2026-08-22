package org.graphiks.kffi.posix

import org.graphiks.kffi.posix.generated.EINTR
import org.graphiks.kffi.posix.generated.F_GETFD
import org.graphiks.kffi.posix.generated.F_GETFL
import org.graphiks.kffi.posix.generated.F_SETFD
import org.graphiks.kffi.posix.generated.F_SETFL
import org.graphiks.kffi.posix.generated.MAP_ANONYMOUS
import org.graphiks.kffi.posix.generated.MFD_CLOEXEC
import org.graphiks.kffi.posix.generated.O_CLOEXEC
import org.graphiks.kffi.posix.generated.PROT_READ
import org.graphiks.kffi.posix.generated.PROT_WRITE
import kotlin.test.Test
import kotlin.test.assertEquals

class LinuxPosixGeneratedBindingTest {
    @Test
    fun generatedLinuxConstantsMatchTheLinuxAbi() {
        if (!isLinux()) return

        assertEquals(1, PROT_READ())
        assertEquals(2, PROT_WRITE())
        assertEquals(0x20, MAP_ANONYMOUS())
        assertEquals(0x80000, O_CLOEXEC())
        assertEquals(1, MFD_CLOEXEC())
        assertEquals(4, EINTR())
        assertEquals(1, F_GETFD())
        assertEquals(2, F_SETFD())
        assertEquals(3, F_GETFL())
        assertEquals(4, F_SETFL())
    }

    private fun isLinux(): Boolean = System.getProperty("os.name") == "Linux"
}
