package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import java.lang.foreign.ValueLayout
import kotlin.test.*

class Win32PointerPacketsTest {
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
}
