@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Win32WndProcBridgeTest {
    @Test
    fun installRoutesDispatchByUserdata() {
        val seen = AtomicInteger(0)
        val route = Win32WndProcRoute { _, _, _, _ -> seen.incrementAndGet().toLong(); 42L }
        val close = Win32WndProcBridge.install(101L, route)
        try {
            assertEquals(42L, Win32WndProcBridge.dispatchWndProc(7L, 0x8001, 1L, 2L, 101L))
            assertEquals(1, seen.get())
        } finally {
            close.close()
        }
    }

    @Test
    fun removedRouteFallsBackWithoutThrowing() {
        val close = Win32WndProcBridge.install(102L, Win32WndProcRoute { _, _, _, _ -> 1L })
        close.close()
        assertEquals(0L, Win32WndProcBridge.dispatchWndProc(7L, 0x8001, 1L, 2L, 102L))
    }

    @Test
    fun duplicateUserdataIsRejected() {
        val close = Win32WndProcBridge.install(103L, Win32WndProcRoute { _, _, _, _ -> 0L })
        try {
            assertFailsWith<IllegalStateException> {
                Win32WndProcBridge.install(103L, Win32WndProcRoute { _, _, _, _ -> 0L })
            }
        } finally {
            close.close()
        }
    }

    @Test
    fun exceptionInRouteIsContainedAndReturnsFallback() {
        val close = Win32WndProcBridge.install(
            104L,
            Win32WndProcRoute { _, _, _, _ -> error("boom") },
        )
        try {
            assertEquals(0L, Win32WndProcBridge.dispatchWndProc(7L, 0x8001, 1L, 2L, 104L))
        } finally {
            close.close()
        }
    }
}
