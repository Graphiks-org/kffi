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
import org.graphiks.kffi.x11.generated.AllPlanes
import org.graphiks.kffi.x11.generated.KeyPress
import org.graphiks.kffi.x11.generated.IsViewable
import org.graphiks.kffi.x11.generated.XCloseDisplay
import org.graphiks.kffi.x11.generated.XArc
import org.graphiks.kffi.x11.generated.XClientMessageEvent
import org.graphiks.kffi.x11.generated.XColor
import org.graphiks.kffi.x11.generated.XImage
import org.graphiks.kffi.x11.generated.XOpenDisplay
import org.graphiks.kffi.x11.generated.XPoint
import org.graphiks.kffi.x11.generated.XRectangle
import org.graphiks.kffi.x11.generated.XSelectionEvent
import org.graphiks.kffi.x11.generated.XSegment
import org.graphiks.kffi.x11.generated.XShmSegmentInfoCompat
import org.graphiks.kffi.x11.generated.XSetWindowAttributes
import org.graphiks.kffi.x11.generated.XSetForeground
import org.graphiks.kffi.x11.generated.XSHM_ZPIXMAP
import org.graphiks.kffi.x11.generated.XWindowAttributes
import org.graphiks.kffi.x11.generated.ZPixmap
import org.graphiks.kffi.x11.generated.XNClientWindow
import org.graphiks.kffi.x11.generated.XNCommitStringCallback
import org.graphiks.kffi.x11.generated.XNFocusWindow
import org.graphiks.kffi.x11.generated.XNInputStyle
import org.graphiks.kffi.x11.generated.XNPreeditAttributes
import org.graphiks.kffi.x11.generated.XNPreeditDoneCallback
import org.graphiks.kffi.x11.generated.XNPreeditDrawCallback
import org.graphiks.kffi.x11.generated.XNPreeditStartCallback
import org.graphiks.kffi.x11.generated.XNArea
import org.graphiks.kffi.x11.generated.XNAreaNeeded
import org.graphiks.kffi.x11.generated.XNSpotLocation

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
                "XCreateGC",
                "XFreeGC",
                "XSetForeground",
                "XAllocNamedColor",
                "XDrawLine",
                "XDrawArc",
                "XFillPolygon",
                "XFillRectangle",
                "XCreatePixmap",
                "XFreePixmap",
                "XShmCreateImage",
                "XCompositeNameWindowPixmap",
                "XDestroyImage",
                "XQueryBestCursor",
                "XCreateIC",
                "XSetICValues",
                "KeyRelease",
            ).all { expected -> declarations.any { it.name == expected } },
        )
        assertEquals(2, KeyPress())
        assertEquals(2, ZPixmap())
        assertEquals(-1L, AllPlanes())
        assertEquals(2, XSHM_ZPIXMAP())
        assertEquals(2, IsViewable())
        assertEquals("inputStyle", XNInputStyle)
        assertEquals("clientWindow", XNClientWindow)
        assertEquals("focusWindow", XNFocusWindow)
        assertEquals("preeditAttributes", XNPreeditAttributes)
        assertEquals("area", XNArea)
        assertEquals("areaNeeded", XNAreaNeeded)
        assertEquals("spotLocation", XNSpotLocation)
        assertEquals("preeditStartCallback", XNPreeditStartCallback)
        assertEquals("preeditDrawCallback", XNPreeditDrawCallback)
        assertEquals("preeditDoneCallback", XNPreeditDoneCallback)
        assertEquals("commitStringCallback", XNCommitStringCallback)

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

        val xQueryBestCursor = declarations.single { it.name == "XQueryBestCursor" }
        assertEquals(Int::class.javaPrimitiveType, xQueryBestCursor.returnType)
        assertContentEquals(
            arrayOf(
                MemorySegment::class.java,
                Long::class.javaPrimitiveType,
                Int::class.javaPrimitiveType,
                Int::class.javaPrimitiveType,
                MemorySegment::class.java,
                MemorySegment::class.java,
            ),
            xQueryBestCursor.parameterTypes,
        )

        val xSetICValues = declarations.single { it.name == "XSetICValues" }
        assertEquals(MemorySegment::class.java, xSetICValues.returnType)
        assertContentEquals(
            arrayOf(
                MemorySegment::class.java,
                MemorySegment::class.java,
                MemorySegment::class.java,
                MemorySegment::class.java,
            ),
            xSetICValues.parameterTypes,
        )
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
        assertIs<StructLayout>(XSegment.layout)
        assertIs<StructLayout>(XArc.layout)
        assertEquals(16L, XColor.layout.byteSize())
        assertEquals(8L, XSegment.layout.byteSize())
        assertEquals(12L, XArc.layout.byteSize())
    }

    @Test
    fun generatedRecordAccessorsRoundTripNativeFields() {
        val arena = java.lang.foreign.Arena.ofConfined()

        arena.use {
            val imageBinding = XImage()
            val image = XImage.allocate(it)
            val pixels = it.allocate(16)
            imageBinding.data(image, pixels)
            imageBinding.bytes_per_line(image, 64)
            imageBinding.bits_per_pixel(image, 32)
            assertEquals(pixels, imageBinding.data(image))
            assertEquals(64, imageBinding.bytes_per_line(image))
            assertEquals(32, imageBinding.bits_per_pixel(image))

            val windowAttributesBinding = XWindowAttributes()
            val attributes = XWindowAttributes.allocate(it)
            windowAttributesBinding.map_state(attributes, IsViewable())
            assertEquals(IsViewable(), windowAttributesBinding.map_state(attributes))

            val clientMessageBinding = XClientMessageEvent()
            val clientMessage = XClientMessageEvent.allocate(it)
            clientMessageBinding.type(clientMessage, 33)
            clientMessageBinding.window(clientMessage, 0x10203040L)
            clientMessageBinding.message_type(clientMessage, 0x50607080L)
            clientMessageBinding.format(clientMessage, 32)
            clientMessageBinding.data_l0(clientMessage, 0x1122334455667788L)
            assertEquals(33, clientMessageBinding.type(clientMessage))
            assertEquals(0x10203040L, clientMessageBinding.window(clientMessage))
            assertEquals(0x50607080L, clientMessageBinding.message_type(clientMessage))
            assertEquals(32, clientMessageBinding.format(clientMessage))
            assertEquals(0x1122334455667788L, clientMessageBinding.data_l0(clientMessage))

            val selectionBinding = XSelectionEvent()
            val selection = XSelectionEvent.allocate(it)
            selectionBinding.requestor(selection, 0x1111L)
            selectionBinding.selection(selection, 0x2222L)
            selectionBinding.target(selection, 0x3333L)
            selectionBinding.property_(selection, 0x4444L)
            assertEquals(0x1111L, selectionBinding.requestor(selection))
            assertEquals(0x2222L, selectionBinding.selection(selection))
            assertEquals(0x3333L, selectionBinding.target(selection))
            assertEquals(0x4444L, selectionBinding.property_(selection))

            val attributesToSetBinding = XSetWindowAttributes()
            val windowAttributes = XSetWindowAttributes.allocate(it)
            attributesToSetBinding.override_redirect(windowAttributes, 1)
            assertEquals(1, attributesToSetBinding.override_redirect(windowAttributes))
        }
    }

    @Test
    fun generatedRecordLayoutsMatchLinuxX11Abi() {
        assertEquals(136L, XImage.layout.byteSize())
        assertEquals(16L, XImage.layout.byteOffset(groupElement("data")))
        assertEquals(44L, XImage.layout.byteOffset(groupElement("bytes_per_line")))
        assertEquals(48L, XImage.layout.byteOffset(groupElement("bits_per_pixel")))

        assertEquals(136L, XWindowAttributes.layout.byteSize())
        assertEquals(92L, XWindowAttributes.layout.byteOffset(groupElement("map_state")))

        assertEquals(96L, XClientMessageEvent.layout.byteSize())
        assertEquals(16L, XClientMessageEvent.layout.byteOffset(groupElement("send_event")))
        assertEquals(56L, XClientMessageEvent.layout.byteOffset(groupElement("data_l0")))

        assertEquals(72L, XSelectionEvent.layout.byteSize())
        assertEquals(32L, XSelectionEvent.layout.byteOffset(groupElement("requestor")))

        assertEquals(112L, XSetWindowAttributes.layout.byteSize())
        assertEquals(88L, XSetWindowAttributes.layout.byteOffset(groupElement("override_redirect")))
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
