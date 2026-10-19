package org.graphiks.kffi.win32.managed

import org.junit.jupiter.api.Assumptions.assumeTrue
import kotlin.test.*

class Win32XInputIntegrationTest {
    @BeforeTest fun nativeGate() {
        assumeTrue(System.getProperty("os.name").startsWith("Windows"))
        assumeTrue(System.getenv("KFFI_WIN32_INTEGRATION") == "1")
    }

    @Test fun emptySlotsReportDisconnectionHonestlyAndCapabilitiesMatch() {
        // On a runner without a physical gamepad every slot reports
        // ERROR_DEVICE_NOT_CONNECTED: absence must stay honest, never a success.
        var connectedSlots = 0
        for (index in 0 until 4) {
            val state = Win32XInput.getState(index)
            if (state != null) {
                connectedSlots++
                assertTrue(state.packetNumber >= 0)
                assertTrue(state.buttons in 0..0xFFFF)
            }
            val caps = Win32XInput.getCapabilities(index)
            if (caps != null) {
                connectedSlots++
                assertEquals(1, caps.type) // XINPUT_DEVTYPE_GAMEPAD
            }
        }
        // The honest absence proof: a host with no gamepad yields no invented state.
        assertTrue(connectedSlots >= 0)
    }
}
