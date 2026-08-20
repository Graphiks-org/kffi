package org.graphiks.kffi.x11

import java.lang.foreign.StructLayout
import java.lang.foreign.UnionLayout
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs
import org.graphiks.kffi.x11.generated.CurrentTime
import org.graphiks.kffi.x11.generated.None
import org.graphiks.kffi.x11.generated.Success
import org.graphiks.kffi.x11.generated.XCloseDisplay
import org.graphiks.kffi.x11.generated.XEvent
import org.graphiks.kffi.x11.generated.XOpenDisplay
import org.graphiks.kffi.x11.generated.XWindowAttributes

class X11BindingTest {
    @Test
    fun exposesCoreFunctionsAndConstants() {
        assertEquals("XOpenDisplay", ::XOpenDisplay.name)
        assertEquals("XCloseDisplay", ::XCloseDisplay.name)
        assertEquals(0L, None().toLong())
        assertEquals(0L, Success().toLong())
        assertEquals(0L, CurrentTime().toLong())
    }

    @Test
    fun preservesUnionAndStructLayouts() {
        assertIs<UnionLayout>(XEvent.layout)
        assertIs<StructLayout>(XWindowAttributes.layout)
    }
}
