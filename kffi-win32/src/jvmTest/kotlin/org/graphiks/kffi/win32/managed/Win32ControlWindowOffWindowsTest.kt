package org.graphiks.kffi.win32.managed

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Win32ControlWindowOffWindowsTest {
    @Test
    fun unsupportedPlatformFailsBeforeAnyNativeCall() {
        if (Win32ControlWindow.isSupported()) {
            // On Windows this portable scenario is meaningless: the real
            // Windows proof lives in Win32ControlWindowIntegrationTest.
            return
        }
        assertFalse(Win32ControlWindow.isSupported())
        val failure = runCatching {
            Win32ControlWindow.open { _, _, _, _ -> 0L }
        }.exceptionOrNull()
        assertTrue(failure is IllegalStateException, "expected actionable failure, got $failure")
        assertTrue(
            failure?.message?.contains("Windows") == true,
            "failure must name the platform requirement: ${failure?.message}",
        )
    }
}
