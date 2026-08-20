package org.graphiks.kffi.x11

import java.lang.foreign.StructLayout
import java.lang.foreign.UnionLayout
import java.lang.foreign.MemorySegment
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue
import org.graphiks.kffi.x11.generated.KffiXEventStorage
import org.graphiks.kffi.x11.generated.KeyPress
import org.graphiks.kffi.x11.generated.XColor
import org.graphiks.kffi.x11.generated.XPoint
import org.graphiks.kffi.x11.generated.XRectangle
import org.graphiks.kffi.x11.generated.XShmSegmentInfoCompat

class X11BindingTest {
    @Test
    fun exposesCoreFunctionsAndConstants() {
        val declarations = Class.forName(
            "org.graphiks.kffi.x11.generated.Xlib_hKt",
            false,
            javaClass.classLoader,
        ).declaredMethods

        assertTrue(
            setOf(
                "XOpenDisplay",
                "XCloseDisplay",
                "XNextEvent",
                "XGetImage",
                "XShmCreateImage",
                "XCompositeNameWindowPixmap",
            ).all { expected -> declarations.any { it.name == expected } },
        )
        assertEquals(2, KeyPress())

        val xOpenDisplay = declarations.single { it.name == "XOpenDisplay" }
        assertEquals(MemorySegment::class.java, xOpenDisplay.returnType)
        assertContentEquals(arrayOf(MemorySegment::class.java), xOpenDisplay.parameterTypes)

        val xNextEvent = declarations.single { it.name == "XNextEvent" }
        assertEquals(Int::class.javaPrimitiveType, xNextEvent.returnType)
        assertContentEquals(
            arrayOf(MemorySegment::class.java, MemorySegment::class.java),
            xNextEvent.parameterTypes,
        )
    }

    @Test
    fun preservesStructLayouts() {
        assertIs<UnionLayout>(KffiXEventStorage.layout)
        assertEquals(192L, KffiXEventStorage.layout.byteSize())
        assertIs<StructLayout>(XShmSegmentInfoCompat.layout)
        assertEquals(32L, XShmSegmentInfoCompat.layout.byteSize())
        assertIs<StructLayout>(XRectangle.layout)
        assertIs<StructLayout>(XPoint.layout)
        assertIs<StructLayout>(XColor.layout)
    }
}
