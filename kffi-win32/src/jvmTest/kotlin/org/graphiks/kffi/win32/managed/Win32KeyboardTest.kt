package org.graphiks.kffi.win32.managed

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class Win32KeyboardTest {
    @Test
    fun keyPacketCopiesScanExtendedRepeatAndReleaseBits() {
        val pressed = Win32KeyPacket.decode(0x41, 0x001e0001)!!
        assertEquals(0x1e, pressed.scanCode)
        assertEquals(1, pressed.repeatCount)
        assertTrue(pressed.pressed)
        assertFalse(pressed.extended)
        assertFalse(pressed.repeat)
        val repeated = Win32KeyPacket.decode(0x41, 0x401e0003)!!
        assertTrue(repeated.repeat)
        assertEquals(3, repeated.repeatCount)
        val released = Win32KeyPacket.decode(0xa3, 0xc11d0001)!!
        assertFalse(released.pressed)
        assertTrue(released.extended)
        assertFalse(released.repeat)
        assertEquals(0x1d, released.scanCode)
    }

    @Test
    fun malformedKeyboardPacketsAreNotInventedAsKeys() {
        assertNull(Win32KeyPacket.decode(256, 0x001e0001))
        assertNull(Win32KeyPacket.decode(-1, 0x001e0001))
        assertNull(Win32KeyPacket.decode(0x41, 0x001e0000))
    }

    @Test
    fun utf16TranslationKeepsOnlyReturnedUnitsAndDoesNotCommitDeadKeys() {
        assertEquals(Win32KeyTranslation("é", false), translatedKey(1, charArrayOf('é', 'x')))
        assertEquals(Win32KeyTranslation("😀", false), translatedKey(2, "😀x".toCharArray()))
        assertEquals(Win32KeyTranslation(null, true), translatedKey(-1, charArrayOf('´')))
        assertEquals(Win32KeyTranslation(null, false), translatedKey(0, charArrayOf('x')))
    }
}
