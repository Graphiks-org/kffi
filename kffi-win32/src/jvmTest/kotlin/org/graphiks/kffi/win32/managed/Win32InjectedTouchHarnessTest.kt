package org.graphiks.kffi.win32.managed

import org.graphiks.kffi.win32.testsupport.Win32InjectedTouchHarness
import kotlin.test.*

class Win32InjectedTouchHarnessTest {
    @Test fun contactsOutsideTheTestClientAreRejectedBeforeNativeInput() {
        val emitter = Win32InjectedTouchHarness.Emitter(0, 0, 2, targetHwnd=1, maxX=20, maxY=20)
        assertFailsWith<IllegalArgumentException> { emitter.frame(Win32InjectedTouchHarness.Contact(0, 21, 0, Win32InjectedTouchHarness.DOWN)) }
        assertFailsWith<IllegalArgumentException> { emitter.frame(Win32InjectedTouchHarness.Contact(0, 0, 21, Win32InjectedTouchHarness.DOWN)) }
    }
}
