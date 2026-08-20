package org.graphiks.kffi.objc

import org.junit.jupiter.api.Assumptions.assumeTrue
import java.lang.foreign.Arena
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class ObjCRuntimeTest {
    @Test
    fun resolvesNSObjectAndDescriptionSelector() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )

        assertNotEquals(MemorySegment.NULL, ObjCRuntime.getClass("NSObject"))
        assertNotEquals(MemorySegment.NULL, ObjCRuntime.sel("description"))

        ObjCRuntime.autoreleasePool {
            Arena.ofConfined().use { arena ->
                val string = ObjCRuntime.newNSString(arena, "kffi")
                assertEquals(4L, NSString(string).length())
                assertEquals("kffi", ObjCRuntime.toJavaString(string))
            }
        }
    }

    @Test
    fun coversAppKitWindowInputAndRenderingBatch() {
        assumeTrue(
            System.getProperty("os.name")?.startsWith("Mac OS") == true,
            "Objective-C runtime tests require macOS",
        )

        val wrappers = listOf(
            NSWindowController(MemorySegment.NULL),
            NSViewController(MemorySegment.NULL),
            NSScreen(MemorySegment.NULL),
            NSEvent(MemorySegment.NULL),
            NSColor(MemorySegment.NULL),
            NSImage(MemorySegment.NULL),
            NSCursor(MemorySegment.NULL),
            NSControl(MemorySegment.NULL),
            NSButton(MemorySegment.NULL),
            NSTextField(MemorySegment.NULL),
        )

        assertEquals(10, wrappers.size)
        wrappers.forEach { wrapper ->
            assertNotEquals(MemorySegment.NULL, ObjCRuntime.getClass(wrapper::class.simpleName!!))
        }
    }
}
