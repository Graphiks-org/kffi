package org.graphiks.kffi.win32.managed

import java.lang.foreign.Arena
import kotlin.test.Test
import kotlin.test.assertEquals

class Win32StructsTest {
    @Test
    fun wndClassExWMatchesWin64Abi() {
        assertEquals(80L, Win32Structs.wndClassExW.byteSize)
        assertEquals(80L, Win32Structs.wndClassExW.layout.byteSize())
        assertEquals(0L, Win32Structs.wndClassExW.cbSizeOffset)
        assertEquals(4L, Win32Structs.wndClassExW.styleOffset)
        assertEquals(8L, Win32Structs.wndClassExW.lpfnWndProcOffset)
        assertEquals(24L, Win32Structs.wndClassExW.hInstanceOffset)
        assertEquals(64L, Win32Structs.wndClassExW.lpszClassNameOffset)
        assertEquals(72L, Win32Structs.wndClassExW.hIconSmOffset)
    }

    @Test
    fun msgMatchesWin64Abi() {
        assertEquals(48L, Win32Structs.msg.byteSize)
        assertEquals(48L, Win32Structs.msg.layout.byteSize())
        assertEquals(0L, Win32Structs.msg.hwndOffset)
        assertEquals(8L, Win32Structs.msg.messageOffset)
        assertEquals(16L, Win32Structs.msg.wParamOffset)
        assertEquals(24L, Win32Structs.msg.lParamOffset)
        assertEquals(32L, Win32Structs.msg.timeOffset)
        assertEquals(36L, Win32Structs.msg.ptXOffset)
        assertEquals(40L, Win32Structs.msg.ptYOffset)
    }

    @Test
    fun allocatedStructRoundTripsValues() {
        Arena.ofConfined().use { arena ->
            val clazz = Win32Structs.wndClassExW.allocate(arena)
            Win32Structs.wndClassExW.setCbSize(clazz, 80)
            Win32Structs.wndClassExW.setLpfnWndProc(clazz, 0x1234L)
            assertEquals(80, Win32Structs.wndClassExW.getCbSize(clazz))
            assertEquals(0x1234L, Win32Structs.wndClassExW.getLpfnWndProc(clazz))
            val message = Win32Structs.msg.allocate(arena)
            Win32Structs.msg.setMessage(message, 0x8001)
            Win32Structs.msg.setWParam(message, 77L)
            assertEquals(0x8001, Win32Structs.msg.getMessage(message))
            assertEquals(77L, Win32Structs.msg.getWParam(message))
        }
    }
}
