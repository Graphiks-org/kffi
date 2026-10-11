package org.graphiks.kffi.win32

import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import org.graphiks.kffi.win32.generated.CreateWindowExW
import org.graphiks.kffi.win32.generated.DestroyWindow
import org.graphiks.kffi.win32.generated.FindWindowExW
import org.graphiks.kffi.win32.generated.IsWindow
import org.graphiks.kffi.win32.generated.init
import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class Win32ChildWindowIntegrationTest {
    @Test
    fun recognizesLiveAndDestroyedWindowHandles() {
        assumeWindows()
        init()

        assertEquals(0, IsWindow(MemorySegment.NULL), "A null handle is not a window")
        Arena.ofConfined().use { arena ->
            val window = createStaticWindow(arena, MemorySegment.NULL)
            try {
                assertNotEquals(0, IsWindow(window), "A newly created window must be valid")
            } finally {
                assertNotEquals(0, DestroyWindow(window), "DestroyWindow must succeed")
            }
            assertEquals(0, IsWindow(window), "A destroyed handle must no longer be valid")
        }
    }

    @Test
    fun findsChildWindowsByClassAndEnumeratesSiblings() {
        assumeWindows()
        init()

        Arena.ofConfined().use { arena ->
            val parent = createStaticWindow(arena, MemorySegment.NULL)
            try {
                val child = createStaticWindow(arena, parent)
                val sibling = createStaticWindow(arena, parent)
                val className = wideString(arena, "STATIC")
                val first = FindWindowExW(parent, MemorySegment.NULL, className, MemorySegment.NULL)
                assertNotEquals(0L, first.address(), "The child must be found by class")
                val second = FindWindowExW(parent, first, className, MemorySegment.NULL)
                assertEquals(
                    setOf(child.address(), sibling.address()),
                    setOf(first.address(), second.address()),
                    "The search must be scoped to the parent and continue after the first child",
                )
                assertEquals(
                    0L,
                    FindWindowExW(parent, second, className, MemorySegment.NULL).address(),
                    "There are no more matching children",
                )
                assertEquals(
                    0L,
                    FindWindowExW(parent, MemorySegment.NULL, wideString(arena, "BUTTON"), MemorySegment.NULL).address(),
                    "A nonmatching class must not find a child",
                )
            } finally {
                assertNotEquals(0, DestroyWindow(parent), "Destroying the parent must release its children")
            }
        }
    }

    private fun assumeWindows() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Windows") == true,
            "Win32 integration tests require Windows",
        )
    }

    private fun createStaticWindow(arena: Arena, parent: MemorySegment): MemorySegment {
        val style = if (parent.address() == 0L) -0x80000000 else 0x40000000 // WS_POPUP / WS_CHILD
        val window = CreateWindowExW(
            0, wideString(arena, "STATIC"), MemorySegment.NULL, style,
            0, 0, 1, 1, parent, MemorySegment.NULL, MemorySegment.NULL, MemorySegment.NULL,
        )
        assertNotEquals(0L, window.address(), "CreateWindowExW must return a window handle")
        return window
    }

    private fun wideString(arena: Arena, value: String): MemorySegment {
        val result = arena.allocate((value.length + 1L) * 2L, 2L)
        value.forEachIndexed { index, char -> result.set(ValueLayout.JAVA_CHAR, index * 2L, char) }
        result.set(ValueLayout.JAVA_CHAR, value.length * 2L, '\u0000')
        return result
    }
}
