package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.generated.DefWindowProcW
import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.*

class Win32WindowPropertiesIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun titleClientSizeStylesAndSignedPositionAreReadBackFromTheRealWindow() {
        Win32ManagedWindow.open("properties") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }.use { window ->
            val h = window.hwnd
            Win32WindowProperties.setTitle(h, "native \uD83D\uDE80")
            val outer = Win32WindowProperties.outerSize(h, 321, 213)
            Win32WindowProperties.setBounds(h, -40, 50, outer.width, outer.height)
            val read = Win32WindowProperties.read(h)
            assertEquals("native \uD83D\uDE80", read.title)
            assertEquals(321, read.clientWidth)
            assertEquals(213, read.clientHeight)
            assertEquals(-40, read.outer.x)
            assertEquals(50, read.outer.y)
            val borderless = read.style and 0x00cf0000.inv()
            Win32WindowProperties.setStyle(h, borderless)
            Win32WindowProperties.setBounds(h, width = 321, height = 213, frameChanged = true)
            assertEquals(borderless, Win32WindowProperties.read(h).style)
            val monitor = Win32WindowProperties.monitorBounds(h)
            assertTrue(monitor.width > 0 && monitor.height > 0)
        }
    }

    @Test fun nativeTrackLimitsConvertClientPixelsAndPreserveOtherMinmaxFields() {
        Win32ManagedWindow.open("limits") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }.use { window ->
            Arena.ofConfined().use { arena ->
                val info = arena.allocate(40, 4)
                for (offset in 0L..36L step 4) info.set(ValueLayout.JAVA_INT, offset, 777)
                val minimum = Win32WindowProperties.outerSize(window.hwnd, 120, 90)
                val maximum = Win32WindowProperties.outerSize(window.hwnd, 500, 400)
                Win32WindowProperties.applyTrackLimits(window.hwnd, info.address(), 120, 90, 500, 400)
                assertEquals(777, info.get(ValueLayout.JAVA_INT, 0))
                assertEquals(777, info.get(ValueLayout.JAVA_INT, 20))
                assertEquals(minimum.width, info.get(ValueLayout.JAVA_INT, 24))
                assertEquals(minimum.height, info.get(ValueLayout.JAVA_INT, 28))
                assertEquals(maximum.width, info.get(ValueLayout.JAVA_INT, 32))
                assertEquals(maximum.height, info.get(ValueLayout.JAVA_INT, 36))
            }
        }
    }

    @Test fun badNativeHandleAndUnrepresentableOuterSizeFailExplicitly() {
        assertFailsWith<IllegalStateException> { Win32WindowProperties.read(0) }
        Win32ManagedWindow.open("overflow") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }.use { window ->
            assertFailsWith<IllegalArgumentException> { Win32WindowProperties.outerSize(window.hwnd, Int.MAX_VALUE, 10) }
            assertFailsWith<IllegalArgumentException> { Win32WindowProperties.setTitle(window.hwnd, "embedded\u0000nul") }
        }
    }

    @Test fun targetStyleCanBePreflightedWithoutChangingTheNativeWindow() {
        Win32ManagedWindow.open("style preflight") { h, m, w, l -> DefWindowProcW(MemorySegment.ofAddress(h), m, w, l) }.use { window ->
            val before = Win32WindowProperties.read(window.hwnd)
            assertFailsWith<IllegalArgumentException> { Win32WindowProperties.outerSize(window.hwnd, Int.MAX_VALUE, 1000, before.style) }
            val borderless = before.style and 0x00cf0000.inv()
            assertEquals(Win32WindowSize(200, 150), Win32WindowProperties.outerSize(window.hwnd, 200, 150, borderless))
            assertEquals(before.style, Win32WindowProperties.read(window.hwnd).style)
        }
    }
}
