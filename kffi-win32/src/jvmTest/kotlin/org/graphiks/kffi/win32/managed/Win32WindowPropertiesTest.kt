package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import kotlin.test.*

class Win32WindowPropertiesTest {
    @Test fun rectUsesFourSignedWindowsLongsAndRejectsOverflow() {
        Arena.ofConfined().use { arena ->
            val rect = arena.allocate(16, 4)
            intArrayOf(-800, -200, -400, 100).forEachIndexed { i, v -> rect.set(ValueLayout.JAVA_INT, i * 4L, v) }
            assertEquals(Win32WindowRect(-800, -200, 400, 300), Win32WindowProperties.decodeRect(rect))
            rect.set(ValueLayout.JAVA_INT, 0, Int.MIN_VALUE)
            rect.set(ValueLayout.JAVA_INT, 8, Int.MAX_VALUE)
            assertFailsWith<IllegalArgumentException> { Win32WindowProperties.decodeRect(rect) }
        }
    }
}
