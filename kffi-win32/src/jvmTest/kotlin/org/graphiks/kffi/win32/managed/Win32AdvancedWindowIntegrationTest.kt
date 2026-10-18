package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.*
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.MemorySegment
import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import kotlin.test.*

class Win32AdvancedWindowIntegrationTest {
    @BeforeTest fun nativeGate() { assumeTrue(System.getProperty("os.name").startsWith("Windows")); assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1"); init() }
    private fun window() = Win32ManagedWindow.open("advanced native") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }

    @Test fun controlCommandWakeReachesItsCallbackWithoutTheOuterPump() {
        var observed = false
        Win32ControlWindow.open { _, message, _, _ -> if (message == 0x8002) observed = true; 0L }.use { control ->
            assertTrue(PostMessageW(MemorySegment.ofAddress(control.hwnd), 0x8002, 0, 0) != 0)
            repeat(32) { control.pollOne(1) }
            assertTrue(observed, "nested User32 loops dispatch command wake directly to WndProc")
        }
    }

    @Test fun topmostAndAttentionUseTheNativeWindowWithoutActivationSimulation() {
        window().use { window ->
            Win32WindowOperations.setTopmost(window.hwnd, true)
            assertTrue(Win32WindowOperations.readTopmost(window.hwnd))
            Win32WindowOperations.setTopmost(window.hwnd, false)
            assertFalse(Win32WindowOperations.readTopmost(window.hwnd))
            ShowWindow(MemorySegment.ofAddress(window.hwnd), 4) // SW_SHOWNOACTIVATE
            assertNotEquals(window.hwnd, GetForegroundWindow().address())
            for(mode in 0..2) {
                Win32WindowOperations.requestAttention(window.hwnd, mode)
                assertNotEquals(window.hwnd, GetForegroundWindow().address(), "attention must not activate its window")
            }
            Win32WindowOperations.requestAttention(window.hwnd, 0)
            assertNotEquals(window.hwnd, GetForegroundWindow().address())
        }
    }

    @Test fun rgbaIconAndCursorOwnTheirResourcesAndIconSlotsAreReadBack() {
        window().use { window ->
            val rgba = ByteArray(16 * 16 * 4) { if (it % 4 == 3) 0xff.toByte() else 0x40 }
            Win32OwnedImage.icon(16, 16, rgba).use { image ->
                assertTrue(image.handle != 0L)
                Win32WindowOperations.setIcon(window.hwnd, image.handle)
                assertEquals(image.handle, Win32WindowOperations.readIcon(window.hwnd))
                Win32WindowOperations.setIcon(window.hwnd, 0)
                assertEquals(0L, Win32WindowOperations.readIcon(window.hwnd))
            }
            Win32OwnedImage.cursor(16, 16, rgba, 3, 4).use { cursor ->
                Win32WindowOperations.setCursor(cursor.handle)
                assertEquals(cursor.handle, Win32WindowOperations.currentCursor())
                Win32WindowOperations.setCursor(Win32WindowOperations.systemCursor(32512))
            }
            assertFailsWith<IllegalArgumentException> { Win32OwnedImage.icon(0, 16, rgba) }
            assertFailsWith<IllegalArgumentException> { Win32OwnedImage.cursor(16, 16, rgba, 16, 0) }
        }
    }

    @Test fun displayAffinityRoundTripsWithNoUniversalCaptureClaim() {
        window().use { window ->
            assertTrue(Win32WindowOperations.setContentProtection(window.hwnd, true))
            assertTrue(Win32WindowOperations.readContentProtection(window.hwnd))
            assertFalse(Win32WindowOperations.setContentProtection(window.hwnd, false))
        }
    }

    @Test fun confinementNeverClearsAReplacedForeignClip() {
        window().use { window ->
            window.setVisible(true)
            SetForegroundWindow(MemorySegment.ofAddress(window.hwnd))
            Win32PointerConfinement(window.hwnd).use { owner ->
                if (GetForegroundWindow().address() == window.hwnd) {
                    assertTrue(owner.acquire())
                    assertTrue(owner.isActive())
                    val owned = Win32PointerConfinement.currentClip()
                    val replacement = Win32WindowRect(owned.x + 2, owned.y + 2, owned.width - 4, owned.height - 4)
                    setNativeClip(replacement)
                    try {
                        assertFalse(owner.isActive())
                        owner.release()
                        assertEquals(replacement, Win32PointerConfinement.currentClip())
                    } finally { assertTrue(ClipCursor(MemorySegment.NULL) != 0) }
                    assertTrue(owner.acquire())
                    owner.release()
                    assertFalse(owner.isActive())
                } else assertFalse(owner.acquire(), "unfocused acquisition must refuse")
                // A foreign clip is deliberately installed, then must survive release by this owner.
                val original = Win32PointerConfinement.currentClip()
                val foreign = Win32WindowRect(original.x + 5, original.y + 5, original.width - 10, original.height - 10)
                setNativeClip(foreign)
                try {
                    assertFalse(owner.acquire())
                    owner.release()
                    assertEquals(foreign, Win32PointerConfinement.currentClip())
                } finally { setNativeClip(original) }
            }
        }
    }
    @Test fun offscreenClientConfinementUsesTheNativeDesktopIntersection() {
        val desktop = Win32WindowRect(GetSystemMetrics(76), GetSystemMetrics(77), GetSystemMetrics(78), GetSystemMetrics(79))
        val requested = Win32WindowRect(desktop.x - 40, desktop.y - 40, 140, 140)
        val expected = Win32WindowRect(desktop.x, desktop.y, 100, 100)
        assertEquals(expected, Win32PointerConfinement.visibleClientRect(requested, desktop))
        assertNull(Win32PointerConfinement.visibleClientRect(Win32WindowRect(desktop.x - 40, desktop.y - 40, 20, 20), desktop))
        val original = Win32PointerConfinement.currentClip()
        try {
            setNativeClip(requested)
            assertEquals(expected, Win32PointerConfinement.currentClip(), "User32 clips off-screen coordinates to the desktop")
            setNativeClip(checkNotNull(Win32PointerConfinement.visibleClientRect(requested, desktop)))
            assertEquals(expected, Win32PointerConfinement.currentClip())
        } finally { setNativeClip(original) }
    }
    private fun setNativeClip(rect: Win32WindowRect) { Arena.ofConfined().use { arena ->
        val value = arena.allocate(16, 4)
        intArrayOf(rect.x, rect.y, rect.x + rect.width, rect.y + rect.height).forEachIndexed { i, v -> value.set(ValueLayout.JAVA_INT, i * 4L, v) }
        assertTrue(ClipCursor(value) != 0)
    } }
}
