package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.ClientToScreen
import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class Win32InputIntegrationTest {
    @BeforeTest
    fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test
    fun keyboardSnapshotAndStatelessTranslationUseTheRealThreadLayout() {
        val snapshot = Win32Keyboard.read(0x41, 0x001e0001)!!
        assertTrue(snapshot.layoutId != 0L)
        assertEquals(0x1e, snapshot.packet.scanCode)
        val state = ByteArray(256)
        val before = Win32Keyboard.translate(0x41, 0x1e, state, snapshot.layoutId)
        assertTrue(!before.characters.isNullOrEmpty(), "the active layout must translate VK_A")
        // Scan all OEM keys statelessly. On layouts with dead keys, reading
        // them must not change the kernel's pending dead-key composition.
        for (vk in 0xba..0xe2) {
            Win32Keyboard.translate(vk, 0, state, snapshot.layoutId)
        }
        assertEquals(before, Win32Keyboard.translate(0x41, 0x1e, state, snapshot.layoutId))
        assertTrue(state.all { it == 0.toByte() }, "the caller's keyboard state is copied")
    }

    @Test
    fun mouseTrackingAndSignedScreenConversionUseARealWindow() {
        Win32ManagedWindow.open("input-native") { hwnd, message, wParam, lParam ->
            DefWindowProcW(MemorySegment.ofAddress(hwnd), message, wParam, lParam)
        }.use { window ->
            Win32Pointer.trackLeave(window.hwnd)
            Win32Pointer.cancelLeave(window.hwnd)
            Arena.ofConfined().use { arena ->
                val point = arena.allocate(8, 4)
                point.set(ValueLayout.JAVA_INT, 0, -15)
                point.set(ValueLayout.JAVA_INT, 4, -20)
                assertTrue(ClientToScreen(MemorySegment.ofAddress(window.hwnd), point) != 0)
                val actual = Win32Pointer.screenToClient(
                    window.hwnd,
                    point.get(ValueLayout.JAVA_INT, 0),
                    point.get(ValueLayout.JAVA_INT, 4),
                )
                assertEquals(Win32Point(-15, -20), actual)
            }
            val settings = Win32Pointer.wheelSettings()
            assertTrue(settings.verticalLines == null || settings.verticalLines!! >= 0L)
            assertTrue(settings.horizontalCharacters == null || settings.horizontalCharacters!! >= 0L)
        }
        assertFailsWith<IllegalStateException> { Win32Pointer.trackLeave(0L) }
    }
}
