package org.graphiks.kffi.win32.managed

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class Win32XInputTest {
    private class FakePort : Win32XInputNativePort {
        var stateAnswer: Int = 0
        var lastStateError: Int = 5 // surfaced as the typed code when getState fails
        var setAnswer: Int = 0
        var capsAnswer: Int = 0
        var batteryAnswer: Int = 0
        var lastErrorCode: Int = 0
        val stateReads = mutableListOf<Int>()
        var vibrationWrites = mutableListOf<Pair<Int, Int>>()
            private set

        override fun getState(index: Int, state: MemorySegment): Int {
            stateReads += index
            if (stateAnswer != 0) return stateAnswer
            // XINPUT_STATE: dwPacketNumber(4) @0, Gamepad @4: wButtons(2)@4, bLeftTrigger@6, bRightTrigger@7, sThumbLX@8, sThumbLY@10, sThumbRX@12, sThumbRY@14
            state.set(java.lang.foreign.ValueLayout.JAVA_INT, 0L, 4242)
            state.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 4L, 0x0C01.toShort()) // A + Start
            state.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 6L, 128.toByte())
            state.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 7L, 64.toByte())
            state.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 8L, 12345.toShort())
            state.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 10L, (-12345).toShort())
            state.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 12L, 500.toShort())
            state.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 14L, (-500).toShort())
            return 0
        }

        override fun setVibration(index: Int, vibration: MemorySegment): Int {
            val left = vibration.get(java.lang.foreign.ValueLayout.JAVA_SHORT, 0).toInt() and 0xFFFF
            val right = vibration.get(java.lang.foreign.ValueLayout.JAVA_SHORT, 2).toInt() and 0xFFFF
            vibrationWrites += left to right
            return setAnswer
        }

        override fun getCapabilities(index: Int, caps: MemorySegment): Int {
            if (capsAnswer != 0) return capsAnswer
            caps.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 0L, 1.toByte()) // XINPUT_DEVTYPE_GAMEPAD
            caps.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 1L, 1.toByte()) // XINPUT_DEVSUBTYPE_GAMEPAD
            caps.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 2L, 0x0001.toShort()) // XINPUT_CAPS_VOICE_SUPPORTED
            caps.set(java.lang.foreign.ValueLayout.JAVA_SHORT, 4L, 0xF3FF.toShort())
            return 0
        }

        override fun getBatteryInformation(index: Int, battery: MemorySegment): Int {
            if (batteryAnswer != 0) return batteryAnswer
            battery.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 0, 2) // BATTERY_TYPE_ALKALINE
            battery.set(java.lang.foreign.ValueLayout.JAVA_BYTE, 1, 4) // BATTERY_LEVEL_FULL
            return 0
        }

        override fun lastError(): Int = if (stateAnswer != 0) stateAnswer else lastErrorCode
    }

    @Test fun getStateCopiesAllFieldsFromTheNativeStruct() {
        val state = assertNotNull(Win32XInput.getState(0, FakePort()))
        assertEquals(4242, state.packetNumber)
        assertEquals(0x0C01, state.buttons)
        assertEquals(128, state.leftTrigger)
        assertEquals(64, state.rightTrigger)
        assertEquals(12345, state.thumbLX)
        assertEquals(-12345, state.thumbLY)
        assertEquals(500, state.thumbRX)
        assertEquals(-500, state.thumbRY)
    }

    @Test fun disconnectedSlotReturnsNullInsteadOfInventingAState() {
        val port = FakePort().apply { stateAnswer = 1167 }
        assertNull(Win32XInput.getState(3, port))
    }

    @Test fun indicesOutsideTheFourSlotsAreRefused() {
        val port = FakePort()
        assertFailsWith<IllegalArgumentException> { Win32XInput.getState(4, port) }
        assertFailsWith<IllegalArgumentException> { Win32XInput.getState(-1, port) }
        assertFailsWith<IllegalArgumentException> { Win32XInput.setVibration(9, 0, 0, port) }
    }

    @Test fun unexpectedFailuresSurfaceAsTypedErrors() {
        val port = FakePort().apply { stateAnswer = 1; lastErrorCode = 5 }
        val failure = assertFailsWith<Win32XInputException> { Win32XInput.getState(0, port) }
        assertEquals(1, failure.code, "the typed code carries the rc the fake returned")
    }

    @Test fun setVibrationWritesBothMotorSpeedsAndReportsDisconnection() {
        val port = FakePort()
        assertTrue(Win32XInput.setVibration(0, 32000, 8000, port))
        assertEquals(listOf(32000 to 8000), port.vibrationWrites)
        val disconnected = FakePort().apply { setAnswer = 1167 }
        assertFalse(Win32XInput.setVibration(0, 100, 200, disconnected))
    }

    @Test fun vibrationMagnitudesAreRangeChecked() {
        val port = FakePort()
        assertFailsWith<IllegalArgumentException> { Win32XInput.setVibration(0, -1, 0, port) }
        assertFailsWith<IllegalArgumentException> { Win32XInput.setVibration(0, 0, 0x10000, port) }
    }

    @Test fun capabilitiesAndBatteryAreCopied() {
        val port = FakePort()
        val caps = assertNotNull(Win32XInput.getCapabilities(0, port))
        assertEquals(1, caps.type)
        assertEquals(1, caps.subType)
        assertEquals(0x0001, caps.flags)
        val battery = assertNotNull(Win32XInput.getBatteryInformation(0, port))
        assertEquals(2, battery.type)
        assertEquals(4, battery.level)
    }
}
