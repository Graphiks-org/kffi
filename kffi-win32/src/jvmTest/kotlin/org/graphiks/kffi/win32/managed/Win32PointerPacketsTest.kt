package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import java.lang.foreign.MemorySegment
import kotlin.test.*

class Win32PointerPacketsTest {
    @Test fun promotedMouseIdentifiesTouchAndPenButNotPhysicalMouse() {
        assertTrue(Win32PointerPackets.isPromotedSignature(0xff515780L))
        assertTrue(Win32PointerPackets.isPromotedSignature(0xff515700L))
        assertFalse(Win32PointerPackets.isPromotedSignature(0L))
        assertFalse(Win32PointerPackets.isPromotedSignature(0xff515680L))
    }
    @Test fun countProductsAreCheckedBeforeAllocation() {
        assertFailsWith<IllegalArgumentException> { Win32PointerPackets.checkedBytes(Int.MAX_VALUE, Int.MAX_VALUE, 144, Int.MAX_VALUE, Int.MAX_VALUE) }
        assertFailsWith<IllegalArgumentException> { Win32PointerPackets.checkedBytes(3, 2, 144, 2, 2) }
        assertEquals(1440L, Win32PointerPackets.checkedBytes(2, 3, 144, 2, 3))
    }
    @Test fun missingPenMasksProduceNulls() = Arena.ofConfined().use { arena ->
        val p = arena.allocate(120, 8)
        p.set(ValueLayout.JAVA_INT, 0, 3); p.set(ValueLayout.JAVA_INT, 4, 42)
        p.set(ValueLayout.JAVA_INT, 104, 1024)
        val sample = Win32PointerPackets.decode(p, 3)
        assertNull(sample.pressure); assertNull(sample.tiltX); assertNull(sample.tiltY); assertNull(sample.twistRadians)
    }
    @Test fun invalidPenValuesAreNeverClamped() = Arena.ofConfined().use { arena ->
        val p = arena.allocate(120, 8)
        p.set(ValueLayout.JAVA_INT, 0, 3); p.set(ValueLayout.JAVA_INT, 4, 1)
        p.set(ValueLayout.JAVA_INT, 100, 15); p.set(ValueLayout.JAVA_INT, 104, 1024)
        p.set(ValueLayout.JAVA_INT, 108, 360); p.set(ValueLayout.JAVA_INT, 112, 91); p.set(ValueLayout.JAVA_INT, 116, -90)
        var sample = Win32PointerPackets.decode(p, 3)
        assertEquals(1.0, sample.pressure); assertNull(sample.tiltX); assertEquals(-90.0, sample.tiltY); assertNull(sample.twistRadians)
        p.set(ValueLayout.JAVA_INT, 104, 1025)
        sample = Win32PointerPackets.decode(p, 3); assertNull(sample.pressure)
    }
    @Test fun aReusedPointerIdDoesNotRetainAnOldPacket() = Arena.ofConfined().use { arena ->
        val p = arena.allocate(120, 8)
        p.set(ValueLayout.JAVA_INT, 0, 3); p.set(ValueLayout.JAVA_INT, 4, 1)
        p.set(ValueLayout.JAVA_INT, 32, 70000); p.set(ValueLayout.JAVA_INT, 36, -80000)
        val old = Win32PointerPackets.decode(p, 3)
        p.set(ValueLayout.JAVA_INT, 32, -42)
        val fresh = Win32PointerPackets.decode(p, 3)
        assertEquals(Win32Point(70000, -80000), old.position)
        assertEquals(Win32Point(-42, -80000), fresh.position)
    }
    @Test fun frameLeaseClosesExactlyOnce() {
        var released = 0
        val batch = Win32PointerBatch(emptyList(), AutoCloseable { released++ })
        batch.close(); batch.close(); assertEquals(1, released)
    }
    @Test fun aSuccessfulButPartialHistoryIsRetriedWithoutTruncation() {
        var calls = 0; var retained = 0L
        val budget = Win32PayloadBudget { bytes -> retained += bytes; AutoCloseable { retained -= bytes } }
        val result = Win32PointerPackets.readFrames(2, 2, 3, budget, { frames, pointers, buffer ->
            calls++
            if (buffer.address() == 0L) {
                assertEquals(0L, retained)
                frames.set(ValueLayout.JAVA_INT, 0, if(calls == 1) 1 else 2)
                pointers.set(ValueLayout.JAVA_INT, 0, 1)
            } else {
                val capacity = buffer.byteSize() / 144
                repeat(capacity.toInt()) { index ->
                    val p = buffer.asSlice(index * 144L, 144)
                    p.set(ValueLayout.JAVA_INT, 0, 2); p.set(ValueLayout.JAVA_INT, 4, 1)
                    p.set(ValueLayout.JAVA_INT, 8, 2 - index)
                    p.set(ValueLayout.JAVA_INT, 32, if(index == 0) 222 else 111)
                }
                // Win32 reports total available entries even when it only copied the newest ones.
                frames.set(ValueLayout.JAVA_INT, 0, 2); pointers.set(ValueLayout.JAVA_INT, 0, 1)
            }
            1
        }, { 0 })
        result.use {
            assertEquals(listOf(2, 1), it.frames.map { frame -> frame.frameId })
            assertEquals(listOf(222, 111), it.frames.map { frame -> frame.pointers.single().position.x })
            assertEquals(4, calls); assertEquals(480L, retained)
        }
        assertEquals(0L, retained)
    }
}
