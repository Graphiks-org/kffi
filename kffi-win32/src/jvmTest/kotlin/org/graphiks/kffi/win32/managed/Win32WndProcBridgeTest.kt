@file:OptIn(org.graphiks.kffi.CallbackRuntimeApi::class)

package org.graphiks.kffi.win32.managed

import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class Win32WndProcBridgeTest {
    @Test
    fun messagesDuringCreationRouteThroughTheThreadSlot() {
        val seen = AtomicInteger(0)
        val creation = Win32WndProcBridge.beginCreation { _, _, _, _ ->
            seen.incrementAndGet().toLong(); 7L
        }
        try {
            assertEquals(7L, Win32WndProcBridge.dispatchWndProc(9L, 0x0081, 0L, 0L))
            assertEquals(1, seen.get())
        } finally {
            creation.close()
        }
        // Après endCreation, plus aucun routage par le slot.
        assertEquals(0L, Win32WndProcBridge.dispatchWndProc(9L, 0x0081, 0L, 0L))
    }

    @Test
    fun registeredHwndRoutesToItsOwnRoute() {
        val first = AtomicInteger(0)
        val second = AtomicInteger(0)
        val close1 = Win32WndProcBridge.registerRoute(100L) { _, _, _, _ ->
            first.incrementAndGet().toLong(); 1L
        }
        val close2 = Win32WndProcBridge.registerRoute(200L) { _, _, _, _ ->
            second.incrementAndGet().toLong(); 2L
        }
        try {
            assertEquals(1L, Win32WndProcBridge.dispatchWndProc(100L, 0x8001, 0L, 0L))
            assertEquals(2L, Win32WndProcBridge.dispatchWndProc(200L, 0x8001, 0L, 0L))
            assertEquals(1, first.get())
            assertEquals(1, second.get())
        } finally {
            close1.close()
            close2.close()
        }
        assertEquals(0L, Win32WndProcBridge.dispatchWndProc(100L, 0x8001, 0L, 0L))
    }

    @Test
    fun removedHwndReRegisteredToANewRouteDeliversToTheNewOwner() {
        val old = AtomicInteger(0)
        val current = AtomicInteger(0)
        val first = Win32WndProcBridge.registerRoute(300L) { _, _, _, _ ->
            old.incrementAndGet().toLong(); 0L
        }
        first.close()
        val second = Win32WndProcBridge.registerRoute(300L) { _, _, _, _ ->
            current.incrementAndGet().toLong(); 9L
        }
        try {
            assertEquals(9L, Win32WndProcBridge.dispatchWndProc(300L, 0x8001, 0L, 0L))
            assertEquals(0, old.get())
            assertEquals(1, current.get())
        } finally {
            second.close()
        }
    }

    @Test
    fun exceptionInRouteIsContainedAndReturnsFallback() {
        val close = Win32WndProcBridge.registerRoute(400L) { _, _, _, _ -> error("boom") }
        try {
            assertEquals(0L, Win32WndProcBridge.dispatchWndProc(400L, 0x8001, 0L, 0L))
        } finally {
            close.close()
        }
    }

    @Test
    fun doubleRegistrationOfSameHwndIsRejected() {
        val close = Win32WndProcBridge.registerRoute(500L) { _, _, _, _ -> 0L }
        try {
            assertFailsWith<IllegalStateException> {
                Win32WndProcBridge.registerRoute(500L) { _, _, _, _ -> 0L }
            }
        } finally {
            close.close()
        }
    }
}
