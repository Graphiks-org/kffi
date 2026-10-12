package org.graphiks.kffi.win32.managed

import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Win32ManagedFunctionsTest {
    @Test
    fun registrationDeliversThroughRouteUntilClosed() {
        val count = AtomicInteger(0)
        val function = Win32ManagedFunctions.wndProc { _, _, _, _ ->
            count.incrementAndGet().toLong()
        }
        try {
            assertTrue(function.callback.rawValue != 0L)
            function.routeForTest(9L, 0x8001, 5L, 6L)
            assertEquals(1, count.get())
        } finally {
            function.close()
        }
        assertTrue(function.isQuiescent)
        // After close: no delivery (revocation before release).
        function.routeForTest(9L, 0x8001, 5L, 6L)
        assertEquals(1, count.get())
    }

    @Test
    fun closeIsIdempotent() {
        val function = Win32ManagedFunctions.wndProc { _, _, _, _ -> 0L }
        function.close()
        function.close()
        assertTrue(function.isQuiescent)
    }
}
