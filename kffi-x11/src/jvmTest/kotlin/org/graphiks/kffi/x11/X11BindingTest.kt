package org.graphiks.kffi.x11

import java.lang.foreign.StructLayout
import java.lang.foreign.UnionLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertIs
import kotlin.test.assertTrue
import org.graphiks.kffi.x11.generated.KffiXEventStorage
import org.graphiks.kffi.x11.generated.KeyPress
import org.graphiks.kffi.x11.generated.XCloseDisplay
import org.graphiks.kffi.x11.generated.XColor
import org.graphiks.kffi.x11.generated.XOpenDisplay
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
                "XDestroyImage",
                "KeyRelease",
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

        val xDestroyImage = declarations.single { it.name == "XDestroyImage" }
        assertEquals(Int::class.javaPrimitiveType, xDestroyImage.returnType)
        assertContentEquals(arrayOf(MemorySegment::class.java), xDestroyImage.parameterTypes)
    }

    @Test
    fun preservesStructLayouts() {
        assertIs<UnionLayout>(KffiXEventStorage.layout)
        assertEquals(192L, KffiXEventStorage.layout.byteSize())
        assertEquals(8L, KffiXEventStorage.layout.byteAlignment())
        assertEquals(0L, KffiXEventStorage.layout.byteOffset(groupElement("type")))
        assertEquals(0L, KffiXEventStorage.layout.byteOffset(groupElement("pad")))

        assertIs<StructLayout>(XShmSegmentInfoCompat.layout)
        assertEquals(32L, XShmSegmentInfoCompat.layout.byteSize())
        assertEquals(8L, XShmSegmentInfoCompat.layout.byteAlignment())
        assertEquals(0L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("shmseg")))
        assertEquals(8L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("shmid")))
        assertEquals(12L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("padding_after_shmid")))
        assertEquals(16L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("shmaddr")))
        assertEquals(24L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("readOnly")))
        assertEquals(28L, XShmSegmentInfoCompat.layout.byteOffset(groupElement("padding_after_read_only")))

        assertIs<StructLayout>(XRectangle.layout)
        assertIs<StructLayout>(XPoint.layout)
        assertIs<StructLayout>(XColor.layout)
    }

    @Test
    fun opensNullDisplayWhenX11IsAvailableOnLinux() {
        if (!System.getProperty("os.name").lowercase().contains("linux")) return

        val display = XOpenDisplay(MemorySegment.NULL)
        if (display != MemorySegment.NULL) {
            XCloseDisplay(display)
        }
    }
}
