package org.graphiks.kffi.x11

import java.lang.foreign.StructLayout
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertTrue
import org.graphiks.kffi.x11.generated.XColor
import org.graphiks.kffi.x11.generated.XPoint
import org.graphiks.kffi.x11.generated.XRectangle

class X11BindingTest {
    @Test
    fun exposesCoreFunctionsAndConstants() {
        val declarations = Class.forName(
            "org.graphiks.kffi.x11.generated.Xlib_hKt",
            false,
            javaClass.classLoader,
        ).declaredMethods.map { it.name }.toSet()

        assertTrue(
            setOf(
                "XOpenDisplay",
                "XCloseDisplay",
                "XNextEvent",
                "XGetImage",
                "XShmCreateImage",
                "XCompositeNameWindowPixmap",
                "KeyPress",
            ).all(declarations::contains),
        )
    }

    @Test
    fun preservesStructLayouts() {
        assertIs<StructLayout>(XRectangle.layout)
        assertIs<StructLayout>(XPoint.layout)
        assertIs<StructLayout>(XColor.layout)
    }
}
