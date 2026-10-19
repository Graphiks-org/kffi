package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import java.util.concurrent.atomic.AtomicInteger
import org.graphiks.kffi.win32.generated._devicemodeW
import kotlin.test.*

class Win32DisplaysTest {
    private val devmodePelsWidth: Long =
        _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmPelsWidth"))
    private val devmodePelsHeight: Long =
        _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmPelsHeight"))
    private val devmodeFrequency: Long =
        _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmDisplayFrequency"))
    private val devmodeBitsPerPel: Long =
        _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement("dmBitsPerPel"))

    private class FakePort(
        var monitors: List<Long> = emptyList(),
        var dpiAnswer: Int? = 96,
        var modes: Map<String, List<Triple<Int, Int, Int>>> = emptyMap(), // (w, h, hz)
        var currentMode: Map<String, Triple<Int, Int, Int>> = emptyMap(),
    ) : Win32DisplayNativePort {
        val enumCalls = AtomicInteger()
        val devicesRequested = mutableListOf<String>()

        override fun enumMonitors(onMonitor: (Long) -> Unit): Boolean {
            enumCalls.incrementAndGet()
            monitors.forEach(onMonitor)
            return true
        }

        override fun monitorInfo(hmonitor: Long, buffer: MemorySegment, cbSize: Int): Boolean {
            if (cbSize != 104) return false
            // MONITORINFOEXW: cbSize(4) rcMonitor(16) rcWork(16) dwFlags(4) szDevice[32](64)
            buffer.set(ValueLayout.JAVA_INT, 4, 0)
            buffer.set(ValueLayout.JAVA_INT, 8, 0)
            buffer.set(ValueLayout.JAVA_INT, 12, 1920)
            buffer.set(ValueLayout.JAVA_INT, 16, 1080)
            buffer.set(ValueLayout.JAVA_INT, 20, 0)
            buffer.set(ValueLayout.JAVA_INT, 24, 0)
            buffer.set(ValueLayout.JAVA_INT, 28, 1920)
            buffer.set(ValueLayout.JAVA_INT, 32, 1040)
            buffer.set(ValueLayout.JAVA_INT, 36, 0)
            val device = "DISPLAY1"
            device.forEachIndexed { index, character ->
                buffer.set(ValueLayout.JAVA_CHAR, 40 + index * 2L, character)
            }
            buffer.set(ValueLayout.JAVA_CHAR, 40 + device.length * 2L, '\u0000')
            return true
        }

        override fun dpiForMonitor(hmonitor: Long, dpiOut: MemorySegment): Boolean {
            val dpi = dpiAnswer ?: return false
            dpiOut.set(ValueLayout.JAVA_INT, 0, dpi)
            dpiOut.set(ValueLayout.JAVA_INT, 4, dpi)
            return true
        }

        override fun enumSettings(device: String, indexOrCurrent: Int, devmode: MemorySegment): Boolean {
            devicesRequested += "$device:$indexOrCurrent"
            val triple = if (indexOrCurrent == Win32DisplayFlags.ENUM_CURRENT_SETTINGS) {
                currentMode[device]
            } else {
                modes[device]?.getOrNull(indexOrCurrent)
            } ?: return false
            fun offset(field: String): Long = _devicemodeW.layout.byteOffset(MemoryLayout.PathElement.groupElement(field))
            devmode.set(ValueLayout.JAVA_INT, offset("dmPelsWidth"), triple.first)
            devmode.set(ValueLayout.JAVA_INT, offset("dmPelsHeight"), triple.second)
            devmode.set(ValueLayout.JAVA_INT, offset("dmDisplayFrequency"), triple.third)
            devmode.set(ValueLayout.JAVA_INT, offset("dmBitsPerPel"), 32)
            return true
        }

        override fun lastError(): Int = 0
    }

    @Test fun snapshotAssemblesMonitorsWithBoundsWorkScaleAndModes() {
        val port = FakePort(
            monitors = listOf(100L),
            modes = mapOf("DISPLAY1" to listOf(Triple(1920, 1080, 60), Triple(1280, 720, 59))),
            currentMode = mapOf("DISPLAY1" to Triple(1920, 1080, 60)),
        )
        val snapshot = Win32Displays.snapshot(port)
        assertEquals(1, snapshot.size)
        val display = snapshot.single()
        assertEquals(100L, display.monitor)
        assertEquals(1920, display.right - display.left)
        assertEquals(1040, display.workBottom - display.workTop)
        assertEquals(1.0, display.scale)
        assertEquals(2, display.modes.size)
        val current = assertNotNull(display.current)
        assertEquals(1920, current.width)
        assertEquals(1080, current.height)
        assertEquals(60, current.hz)
        assertEquals(32, current.bits)
        assertEquals(listOf("DISPLAY1:-1") + (0..1).map { "DISPLAY1:$it" }.take(2), port.devicesRequested.take(3))
    }

    @Test fun snapshotFailsTypedWhenScaleIsUnreadable() {
        val port = FakePort(monitors = listOf(100L), dpiAnswer = null)
        val failure = assertFailsWith<Win32DisplayException> { Win32Displays.snapshot(port) }
        assertEquals(Win32Displays.E_SCALE_UNAVAILABLE, failure.code)
    }

    @Test fun modeEnumerationIsBoundedAndStopsAtTheFirstMissingIndex() {
        val port = FakePort(
            monitors = listOf(100L),
            modes = mapOf("DISPLAY1" to (1..200).map { Triple(640, 480, it) }),
            currentMode = mapOf("DISPLAY1" to Triple(640, 480, 60)),
        )
        val snapshot = Win32Displays.snapshot(port)
        assertTrue(snapshot.single().modes.size <= 256, "the mode walk must be bounded")
    }

    @Test fun deviceNameIsParsedFromTheInfoBufferForTheModeWalk() {
        val port = FakePort(
            monitors = listOf(100L),
            modes = mapOf("DISPLAY1" to listOf(Triple(1920, 1080, 60))),
            currentMode = mapOf("DISPLAY1" to Triple(1920, 1080, 60)),
        )
        Win32Displays.snapshot(port)
        assertTrue(port.devicesRequested.contains("DISPLAY1:-1"), "devices: ${port.devicesRequested}")
        assertTrue(port.devicesRequested.contains("DISPLAY1:0"), "devices: ${port.devicesRequested}")
    }
}
