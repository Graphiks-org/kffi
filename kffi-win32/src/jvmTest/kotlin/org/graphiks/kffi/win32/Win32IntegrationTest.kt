package org.graphiks.kffi.win32

import java.lang.foreign.MemorySegment
import org.graphiks.kffi.win32.generated.GetCurrentThreadId
import org.graphiks.kffi.win32.generated.GetLastError
import org.graphiks.kffi.win32.generated.GetModuleHandleW
import org.graphiks.kffi.win32.generated.SetLastError
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

class Win32IntegrationTest {
    @Test
    fun initializesAndCallsKernel32Bindings() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Windows") == true,
            "Win32 integration tests require Windows",
        )

        init()

        assertTrue(GetCurrentThreadId() > 0, "GetCurrentThreadId must return a live thread id")

        val sentinel = 0x5A17
        SetLastError(sentinel)
        assertEquals(sentinel, GetLastError())

        assertNotEquals(0L, GetModuleHandleW(MemorySegment.NULL).address())
    }
}
